package org.xtext.iec62443.baseModel.userInterface;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.view.*;

/** @see https://stackoverflow.com/a/45055683/230513 */
public class SwingPanelGraph {

    public static void main(String args[]) {
        EventQueue.invokeLater(new SwingPanelGraph()::display);
    }

    private void display() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout()){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(640, 480);
            }
        };
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        Graph graph = new SingleGraph("Tutorial", false, true);
        graph.addEdge("AB", "A", "B");
        graph.addEdge("CD", "C", "D");
        Node a = graph.getNode("A");
        Node b = graph.getNode("B");
        Node c = graph.getNode("C");
        Node d = graph.getNode("D");
        Viewer viewer = new SwingViewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        viewPanel.getCamera().setViewCenter(0,0,0);
        viewPanel.getCamera().setViewPercent(2);
        viewer.enableAutoLayout();
        viewPanel.getCamera().resetView();


        
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}