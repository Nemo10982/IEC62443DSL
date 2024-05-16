/*
 * generated by Xtext 2.32.0
 */
package org.xtext.iec62443.baseModel.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.iec62443.baseModel.mIEC.Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.iec62443.baseModel.mIEC.MIECPackage

@ExtendWith(InjectionExtension)
@InjectWith(MiecInjectorProvider)
class MiecValidationTestFalse {
	@Inject
	ParseHelper<Model> parseHelper
	@Inject
	ValidationTestHelper testHelper
	
	
	@Test
	def void testDuplicateComponent() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				),
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				)
			}
		}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.COMPONENT , "", "duplicate name")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testDuplicateZone() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
		}
		Conduit test {
			connects (test);
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
		}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.ZONE , "", "duplicate name")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testDuplicateCounter() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL0 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					};
					countermeasures{
						(
							cntTest;
							capability [ SL1 , SL0 , SL0 , SL0 , SL0, SL0 , SL0 ]
						),
						(
							cntTest;
							capability [ SL1 , SL0 , SL0 , SL0 , SL0, SL0 , SL0 ]
						)
					}
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.COUNTER_MEASURE , "", "duplicate name")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testDuplicateChannel() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					}
				}
				
				Conduit condTest {
					connects (test, test2);
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components{
						(
							device devTestConduit ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					};
					channels{
						( deviceChannel;
							connects{
								devTest,
								devTest2,
								devTestConduit
							}
						),
						( deviceChannel;
							connects{
								devTest,
								devTest2,
								devTestConduit
							}
						)
					}
				}
				
				Zone test2 {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest2 ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					}
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CHANNEL , "", "duplicate name")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testDuplicateProperty() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								intProp = 0,
								intProp = 2
							}
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.PROPERTY , "", "duplicate name")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testMultipleMentionZone() {
		val result = parseHelper.parse('''
					Zone test {
						target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
					}
					Conduit testcnd {
						connects (test, test);
						target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
					}
					
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONDUIT , "", "connected multiple times")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testMultipleMentionComponent() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					}
				}
				
				Conduit condTest {
					connects (test, test2);
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components{
						(
							device devTestConduit ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					};
					channels{
						( deviceChannel;
							connects{
								devTest,
								devTest,
								devTestConduit
							}
						)
					}
				}
				
				Zone test2 {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest2 ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					}
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CHANNEL , "", "connected multiple times")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testSubZoneSlevel() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					};
					subzones{
						Zone testSub {
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL0]
						}
					}
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.ZONE , "", "lower target SL")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testConnectsItself() {
		val result = parseHelper.parse('''
							Zone test {
								target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
							}
							Conduit testcnd {
								connects (test, testcnd);
								target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
							}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONDUIT , "", "connects to itself")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testChannelConnectsInZone() {
		val result = parseHelper.parse('''
						Zone test {
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components {
								(
									device devTest ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								)
							}
						}
						
						Conduit condTest {
							connects (test);
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components{
								(
									device devTestConduit ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								)
							};
							channels{
								( deviceChannel;
									connects{
										devTest,
										devTest2,
										devTestConduit
									}
								)
							}
						}
						
						Zone test2 {
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components {
								(
									device devTest2 ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								)
							}
						}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CHANNEL , "", "a component that is not in the zone")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testApplicationRanLocally() {
		val result = parseHelper.parse('''
						Zone test {
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components {
								(
									device devTest ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								),
								(
									application appTest;
									executed on devTest2;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
									
								)
							}
						}
						
						Conduit condTest {
							connects (test, test2);
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components{
								(
									device devTestConduit ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								)
							};
							channels{
								( deviceChannel;
									connects{
										devTest,
										devTest2,
										devTestConduit
									}
								)
							}
						}
						
						Zone test2 {
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components {
								(
									device devTest2 ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								)
							}
						}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.APPLICATION , "", "which is not in the same zone")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testWarningNotExecuted() {
		val result = parseHelper.parse('''
						Zone test {
							target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
							components {
								(
									device devTest ;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
								),
								(
									application appTest;
									executed on nothing;
									capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
									
								)
							}
						}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertWarning(result, MIECPackage.Literals.APPLICATION , "", "is not executed")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testImpossibleTarget() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest ;
					capability [ SL0 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				)
			}
		}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.ZONE , "", "not compatible with component")
		testHelper.assertError(result, MIECPackage.Literals.ZONE , "", "can't be achieved")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testErrorPropertyNotPresent() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp2 = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								stringProp = ref "stringProp2"
							};
							properties{
								stringProp = "str"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONSTRAINT , "", "is not present in device")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testErrorPropertyNotPresentRef() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								stringProp = ref "stringProp2"
							};
							properties{
								stringProp = "str"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONSTRAINT , "", "is not present in device")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testErrorPropertyNotPresentSelfRef() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = "str",
								stringProp2 = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								stringProp = self "stringProp"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONSTRAINT , "", "is not present in the application")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testErrorPropertyIncorrectType() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = 0
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								stringProp = "str"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONSTRAINT , "", "does not have the correct type")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testErrorPropertyNotValid() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								stringProp = "str2"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.CONSTRAINT , "", "is not verified in")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testWarningPropertyNotPresent() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp2 = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								optional stringProp = ref "stringProp2"
							};
							properties{
								stringProp = "str"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertWarning(result, MIECPackage.Literals.CONSTRAINT , "", "is not present in device")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testWarningPropertyNotPresentRef() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								optional stringProp = ref "stringProp2"
							};
							properties{
								stringProp = "str"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertWarning(result, MIECPackage.Literals.CONSTRAINT , "", "is not present in device")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testWarningPropertyNotPresentSelfRef() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = "str",
								stringProp2 = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								optional stringProp = self "stringProp"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertWarning(result, MIECPackage.Literals.CONSTRAINT , "", "is not present in the application")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testWarningPropertyIncorrectType() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = 0
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								optional stringProp = "str"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertWarning(result, MIECPackage.Literals.CONSTRAINT , "", "does not have the correct type")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testWarningPropertyNotValid() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								stringProp = "str"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								optional stringProp = "str2"
							}
							
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertWarning(result, MIECPackage.Literals.CONSTRAINT , "", "is not verified in")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void testAccess() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				),
				(
					application appTest;
					executed on devTest;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					communicates with {
						devTest2
					}
					
				)
				
			}
		}
		
		Zone test2 {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest2 ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				)
			}
		}
		''')
		Assertions.assertNotNull(result) 
		testHelper.assertError(result, MIECPackage.Literals.APPLICATION , "", "can't access the component")
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
