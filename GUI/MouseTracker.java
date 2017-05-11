import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MouseTrackerFrame extends JFrame{
    
    private JPanel mousePanel;  //panel in which mouse events will occur
    private JLabel statusBar;  //label thats displays event information
    
    public MouseTrackerFrame(){
        super("Demonstrating Mouse Events");
        
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);  //add panel to JFrame
        
        statusBar = new JLabel("Mouse outside JPanel");
        //statusBar.setBackground(Color.BLUE);
        add(statusBar, BorderLayout.SOUTH);
        
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }
    
    private class MouseHandler implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Released at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.orange);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText(String.format("Mouse outside JPanel"));
            mousePanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));
        }
        
    }
}

public class MouseTracker {

    public static void main(String[] args) {
        
        MouseTrackerFrame myFrame = new MouseTrackerFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        myFrame.setSize(300, 150);
        myFrame.setVisible(true);
    }
    
}
