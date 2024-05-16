package org.xtext.iec62443.baseModel.userInterface;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.util.EnumSet;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.util.MouseOverMouseManager;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.util.InteractiveElement;
import org.graphstream.ui.view.util.MouseManager;
import org.xtext.iec62443.baseModel.mIEC.*;
import org.graphstream.ui.swing_viewer.ViewPanel;


public class GraphStreamVisualization {

	protected static String styleSheet =
	        "node {" +
	        "	fill-color: purple;" +
	        "	size: 40px;" +
	        "	text-alignment: above;" +
	        "   shape : diamond;"+
	        "   text-mode: normal;"+
	        "}" +
	        "node.hovered {" +
	        "	fill-color: red;" +
	        "	size: 40px;" +
	        "	text-alignment: above;" +
	        "   shape : diamond;"+
	        "}" +
	        "node.cantBeRemoved {" +
	        "	fill-color: pink;" +
	        "	size: 40px;" +
	        "	text-alignment: above;" +
	        "   shape : diamond;"+
	        "}" +
	        "node.dev {" +
	        "	fill-color: blue;" +
	        "	size: 60px;" +
	        "	text-alignment: above;" +
	        "}" +
	        "node.ctm {" +
	        "	fill-color: green;" +
	        "	size: 60px;" +
	        "	text-alignment: above;" +
	        "   shape : cross;"+
	        "}" +
	        "node.ctmstopped {" +
	        "	fill-color: grey;" +
	        "	size: 60px;" +
	        "	text-alignment: above;" +
	        "   shape : cross;"+
	        "}" +
	        "node.devsel {" +
	        "	fill-color: red;" +
	        "	size: 60px;" +
	        "	text-alignment: above;" +
	        "}" +
	        "node.devattacked {" +
	        "	fill-color: red;" +
	        "	size: 60px;" +
	        "	text-alignment: above;" +
	        "}" +
	        "node.app {" +
	        "	fill-color: grey;" +
	        "	size: 20px;" +
	        "	text-alignment: above;" +
	        "   shape : circle;"+
	        "}" +
	        "edge {" +
	        "	fill-color: red;" +
	        "   z-index : 4;"+
	        "}" +
	        "edge.devtozone {" +
	        "	fill-color: green;" +
	        "}" +
	        "edge.apptodev {" +
	        "	fill-color: blue;" +
	        "}" +
	        "edge.comptocomp {" +
	        "	fill-color: lightblue;" +
	        "   stroke-mode: dashes ;"+
	        "}"+
	        "sprite {"+
	        "   fill-mode: none;"+
	        "   text-size:11;"+
	        "   z-index : 5;"+
	        "   text-alignment: center;"+
	        "}"+
	        "sprite.small {"+
	        "   fill-mode: none;"+
	        "   text-size:9;"+
	        "   z-index : 5;"+
	        "   text-alignment: center;"+
	        "}"
	        ;
	
	
	public static Graph getGraphFromEnv(Model e) {
		Graph graph = new SingleGraph("System");

		graph.setAttribute("ui.stylesheet", styleSheet);
		graph.setAttribute("layout.quality", 4);
		
		// Add zones as main nodes
		for (Zone z : e.getZones()) {
			Node n = graph.addNode(z.getName());
			n.setAttribute("layout.weight", 1.5);
			n.setAttribute("ui.label", n.getId());
			
			
			// add components as subnodes
			
			for (Component c: z.getComponents()) {
				if (c.getType() == Component.DEVICE) {
					Device d = (Device) c;
					
					Node n2 = graph.addNode(c.getName());
					Edge edge2 = graph.addEdge(n2.getId() + "_to_" + n.getId(), n2, n);
					edge2.setAttribute("ui.class", "devtozone");
					n2.setAttribute("ui.class", "dev");
					n2.setAttribute("device", d);
					n2.setAttribute("ui.label", n2.getId());
					n2.setAttribute("layout.weight", 0.2);
					if (d.getProperty("attacked") != null) {
						n2.setAttribute("ui.class", "devattacked");
					}
					
					for (Application a: d.getRunning() ) {

						Node n3 = graph.addNode(a.getName());
						Edge edge3 = graph.addEdge(n3.getId() + "_to_" + n2.getId(), n3, n2);
						n3.setAttribute("ui.label", n3.getId());
						edge3.setAttribute("ui.class", "apptodev");
						n3.setAttribute("ui.class", "app");
						n3.setAttribute("layout.weight", 0.1);
					}
				}
				
			}
			
			// Add countermeasures as subnodes
			
			for (CounterMeasure ctm: z.getCountermeasures()) {
				Node n2 = graph.addNode(ctm.getName());
				Edge edge2 = graph.addEdge("ctm_" + n2.getId() + "_to_" + n.getId(), n2, n);
				edge2.setAttribute("ui.class", "devtozone");
				if (ctm.isInactive()) {
					n2.setAttribute("ui.class", "ctmstopped");
				}
				else {
					n2.setAttribute("ui.class", "ctm");
				}
				n2.setAttribute("ui.label", n2.getId());
				n2.setAttribute("layout.weight", 0.2);
				java.lang.System.out.println(n2.getAttribute("ui.class"));
				
			}
			
			
			
		}
		
//		for (Component c: e.getComponents()) {
//			Node n1 = graph.getNode(c.getName());
//			for (Component c2: c.getCommunicatesWith()) {
//				Node n2 = graph.getNode(c2.getName());
//				if (n1.getEdgeFrom(n2) == null && n1.getEdgeToward(n2) == null) {
//					Edge edge = graph.addEdge(c.getName() + "_link_" + c2.getName(), n1,n2);
//					edge.setAttribute("ui.class", "comptocomp");
//				}
//			}
//		}
		
		
		// add conduits as edges between the zone nodes
		for (Conduit c: e.getConduits()) {
			List<Zone> zonesConnected = c.getConnects();
			for (int i1 = 0; i1 < zonesConnected.size(); i1++) {
				for (int i2 = i1+1; i2 < zonesConnected.size(); i2++) {
					Zone z1 = zonesConnected.get(i1);
					Zone z2 = zonesConnected.get(i2);
					Edge edge = graph.addEdge(c.getName(), z1.getName(), z2.getName());
					edge.setAttribute("layout.weight", 2.5);
					edge.setAttribute("ui.class", "zonetozone"); // currently default edge style

					
				}
			}

			
		}
		
		
		
		
		
		return graph;
	}
	
	static JFrame display(Graph g, SwingViewer v) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout()){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1280, 960);
            }
        };
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.add((ViewPanel) v.addDefaultView(false));
        v.getDefaultView().getCamera().resetView();
        v.enableAutoLayout();
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        return frame;
    }

	public static Component showVisualization(Model m) {
		Graph g = getGraphFromEnv(m);
		java.lang.System.setProperty("org.graphstream.ui", "swing");
//		SwingViewer v = (SwingViewer) g.display();
		SwingViewer v = new SwingViewer(g, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
		JFrame frame = display(g,v);
		MouseManager mouseManager = new MouseOverMouseManager (EnumSet.of(InteractiveElement.EDGE, InteractiveElement.NODE, InteractiveElement.SPRITE))
		{ 
//			@Override
//			public void mouseDragged(MouseEvent event) {
//
//		    }
		};
		v.getDefaultView().setMouseManager(mouseManager);
		GraphMouseListener listener = new GraphMouseListener(g, v);

		// Process events in the swing window
//		while(listener.isLoop()) {
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			java.lang.System.err.println("aaaa");
//			java.lang.System.err.flush();
//		}
//		// Process events in the swing window
//		while(listener.isLoop()) {
//			Thread.sleep(20);
//		}
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));;
		
		if (listener.getToRemove() == null) {
			return null;
		}
		
		
		
//
//		java.lang.System.out.println("toRemoveNode " +g.getNode(listener.getToRemove()));
//		g.getNode(listener.getToRemove()).attributeKeys().forEach(s -> {
//
//			java.lang.System.out.println(s);
//		});
//		java.lang.System.out.flush();
		
		return (Component) g.getNode(listener.getToRemove()).getAttribute("device");
	}
	
}
