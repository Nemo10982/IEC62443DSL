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

@ExtendWith(InjectionExtension)
@InjectWith(MiecInjectorProvider)
class MiecParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void EmptyModel() {
		val result = parseHelper.parse('''
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void OneZone() {
		val result = parseHelper.parse('''
			Zone test {
				target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
			}
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void OneConduitOneZone() {
		val result = parseHelper.parse('''
			Zone test {
				target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
			}
			Conduit testcnd {
				connects (test);
				target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
			}
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	
	@Test
	def void AppDef() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					application appTest ;
					executed on nothing ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				)
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void DevDef() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device appTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				)
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void SystemDef() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					system sysTest;
					capability [SL4,SL4,SL4,SL4,SL4,SL4,SL4];
					devices{
						(	
							device appTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
						)
					}
				)
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	@Test
	def void appOnDevice() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					application appTest ;
					executed on devTest ;
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
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void appCommunicate() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					application appTest ;
					executed on devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					communicates with {
						devTest
					}
				),
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ]
				)
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void appCommunicateOnConduit() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					application appTest ;
					executed on devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					communicates with {
						devTestConduit
					}
				),
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
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void appCommunicateThroughConduit() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					application appTest ;
					executed on devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					communicates with {
						devTest2
					}
				),
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
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void conduitsLinksTwoZones() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
		}
		
		Conduit condTest {
			connects (test, test2);
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
		}
		
		Zone test2 {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testChannelDef() {
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
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testCountermeasureDef() {
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
				)
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testSubZone() {
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
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
				}
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testSubConduit() {
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
				Conduit testSub {
					connects (test);
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1]
				}
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testPropertyInt() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					properties{
						intProp = 0
					}
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testPropertyBool() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					properties{
						boolProp = false
					}
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testPropertyString() {
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
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testPropertyFloat() {
		val result = parseHelper.parse('''
		Zone test {
			target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
			components {
				(
					device devTest ;
					capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
					properties{
						floatProp = 0.5
					}
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testpresenceConstraint() {
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
						needs stringProp
					}
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testOptionalConstraint() {
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
						optional needs stringProp2
					}
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testSelfConstraint() {
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
						stringProp = self "stringProp"
					};
					properties{
						stringProp = "str"
					}
					
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testDeviceConstraint() {
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
						stringProp = ref "stringProp2"
					}
					
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testImmediateConstraint() {
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
						stringProp = "str"
					}
				)
			}
			
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testComparisonsInteger() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								IntProp = 0
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								IntProp = 0,
								IntProp != 5,
								IntProp <= 0,
								IntProp >= -5,
								IntProp < 5,
								IntProp > -5
							}
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testComparisonsFloat() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								FloatProp = 0.5
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								FloatProp = 0.5,
								FloatProp != 5.5,
								FloatProp <= 0.5,
								FloatProp >= -5.5,
								FloatProp < 5.5,
								FloatProp > -5.5
							}
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testComparisonsBoolean() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								BoolProp = false
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								BoolProp = false,
								BoolProp != true,
								BoolProp <= false,
								BoolProp >= false,
								BoolProp < true,
								optional BoolProp > false
							}
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testComparisonsString() {
		val result = parseHelper.parse('''
				Zone test {
					target [SL1,SL1,SL1,SL1,SL1,SL1,SL1];
					components {
						(
							device devTest ;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							properties{
								StringProp = "test"
							}
						),
						(
							application appTest;
							executed on devTest;
							capability [ SL4 , SL4 , SL4 , SL4 , SL4 , SL4 , SL4 ];
							constraints{
								StringProp = "test",
								StringProp != "test2",
								StringProp <= "zest",
								StringProp >= "best",
								StringProp < "vest",
								StringProp > "rest"
							}
						)
					}
					
				}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	
	
	@Test
	def void test() {
		val result = parseHelper.parse('''
		
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
