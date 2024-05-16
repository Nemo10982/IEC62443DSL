package org.xtext.iec62443.baseModel.userInterface;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;
import org.xtext.iec62443.baseModel.mIEC.*;

public class GraphMouseListener implements ViewerListener {
	protected boolean loop = true;
	protected ViewerPipe listener;
	protected Viewer viewer;
	protected Graph graph;
	protected String toRemove;
	
	public GraphMouseListener(Graph graph, Viewer viewer) {
		this.viewer = viewer;
		this.graph = graph;
		toRemove = null;
		
		viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
		
		ViewerPipe fromViewer = viewer.newViewerPipe();
		listener = fromViewer;
		fromViewer.addViewerListener(this);
		fromViewer.addAttributeSink(graph);

		while(loop) {
			try {
				listener.pump();
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public boolean isLoop() {
		return loop;
	}

	public ViewerPipe getListener() {
		return listener;
	}

	public void viewClosed(String id) {
		loop = false;
	}
	
	public String getToRemove() {
		return toRemove;
	}

	public void buttonPushed(String id) {
		java.lang.System.out.println("Button pushed on node "+id);
			
	}
	public void buttonReleased(String id) {
		java.lang.System.out.println("Button released on node "+id);
		Node n = graph.getNode(id);
		// If the button is pressed on a device node and its not already attacked:
		if (n.getAttribute("ui.class") == "devsel" ) {
			java.lang.System.out.println("Selected node "+id);
			// return its name and stop
			toRemove = n.getId();
			loop = false;
		}
	}

	// When the mouse hover on a node, change its color to red
	public void mouseOver(String id) {
		Node n = graph.getNode(id);
		if (n == null) {
			return;
		}
		if (n.getAttribute("ui.class") == "dev") {
			n.setAttribute("ui.class", "devsel");
		}
	}

	// When the mouse no longer hovers over a node, change its color back to black
	public void mouseLeft(String id) {
		Node n = graph.getNode(id);
		if (n == null) {
			return;
		}
		if (n.getAttribute("ui.class") == "devsel") {
			n.setAttribute("ui.class", "dev");
		}
	}

}

