package gui;

import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images 
import javax.swing.SwingConstants; // common constants used with swing

class LabelFrame extends JFrame{
    private JLabel label1; // JLabel with just text
    private JLabel label2; // JLabel constructed with text and icon
    private JLabel label3; // JLabel with added text and icon
    
    public LabelFrame(){
        super("Test Label");
        setLayout(new FlowLayout()); // set frame layout
        
        label1 = new JLabel("Label with text"); // JLabel constructor with a string arguments
        label1.setToolTipText("This is label1");
        add(label1); // add label1 to JFrame
        
        // JLabel constructor with string, Icon and alignment arguments
        Icon bug = new ImageIcon(getClass().getResource("ic_action_search.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        label3 = new JLabel(); // JLabel constructor no arguments
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("THis is label3");
        add(label3);
    }
}

public class ImageText {

    public static void main(String[] args) {
        
        LabelFrame myLF = new LabelFrame(); // create JLabelFrame
        myLF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myLF.setSize(260, 180); // set Frame size
        myLF.setVisible(true); // display frame
    }
}
