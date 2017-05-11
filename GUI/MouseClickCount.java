package gui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseDetailsFrame extends JFrame{
    private String details;
    private JLabel statusBar;
    
    public MouseDetailsFrame(){
        super("Mouse Clicks and buttons");
        
        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }
    
    private class MouseClickHandler extends MouseAdapter{
        
        public void mouseClicked(MouseEvent event){
            int xPos = event.getX();
            int yPos = event.getY();
            
            details = String.format("Clicked %d time(s)", event.getClickCount());
            
            if(event.isMetaDown()){ //right mouse button
                details += " with right mouse button";
            }
            else if(event.isAltDown()){ //middle mouse button
                details += " with center mouse button";
            }
            else{ //left mouse button
                details += " with left mouse button";
            }
            statusBar.setText(details);
        }
    }
}

public class MouseClickCount {

    public static void main(String[] args) {
        MouseDetailsFrame msdtlfrm = new MouseDetailsFrame();
        msdtlfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        msdtlfrm.setSize(400, 150);
        msdtlfrm.setLocationRelativeTo(null);
        msdtlfrm.setVisible(true);
    }  
}
