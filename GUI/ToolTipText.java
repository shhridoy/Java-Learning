package learn;

import javax.swing.JFrame;
package learn;
import javax.swing.JFrame;   //import for window features like titlebar, maximize, minimize etc.
import java.awt.FlowLayout;  //for flowing layout
import javax.swing.JLabel; //for output images or text

class GUI_2Class extends JFrame{
    
    private JLabel item;
    
    public GUI_2Class(){
        super("The title bar");
        setLayout(new FlowLayout());;
        
        item = new JLabel("This is a sentence.");
        item.setToolTipText("This is gonna show up on hover");
        add(item);
    }
}

public class ToolTipText {

    public static void main(String[] args) {
        
        GUI_2Class obj = new GUI_2Class();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(275, 180);
        obj.setVisible(true);
    }
}
