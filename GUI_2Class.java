package learn;
import javax.swing.JFrame;   //import for window features like titlebar, maximize, minimize etc.
import java.awt.FlowLayout;  //for flowing layout
import javax.swing.JLabel;   //for output images or text

public class GUI_2Class extends JFrame{
    
    private JLabel item;
    
    public GUI_2Class(){
        super("The title bar");
        setLayout(new FlowLayout());;
        
        item = new JLabel("This is a sentence.");
        item.setToolTipText("This is gonna show up on hover");
        add(item);
    }
}
