package gui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ComboBoxFrame extends JFrame{
    private JComboBox imagesComboBox;
    private JLabel label;
    
    private static final String[] names = {
        "Search", "Camera", "Favicon", "Play"
    };
    
    private Icon[] icons = {
        new ImageIcon(getClass().getResource("ic_action_search.png")),
        new ImageIcon(getClass().getResource("camera-loader.gif")),
        new ImageIcon(getClass().getResource("favicon.png")),
        new ImageIcon(getClass().getResource("playbutton.png"))
    };
    
    public ComboBoxFrame(){
        super("ComboBox Test");
        setLayout(new FlowLayout());
        
        imagesComboBox = new JComboBox(names);
        imagesComboBox.setMaximumRowCount(3);
        imagesComboBox.addItemListener(
            new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent event) {
                if(event.getStateChange() == ItemEvent.SELECTED){
                    label.setIcon(icons[imagesComboBox.getSelectedIndex()]);
                }
            }
            
        });
        add(imagesComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}

public class ComboBoxGui{
    
   public static void main(String[] args){
       
       ComboBoxFrame ob = new ComboBoxFrame();
       ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ob.setSize(350, 150);
       ob.setLocationRelativeTo(null); // to show Frame at middle of window
       ob.setVisible(true);
      
   }
}
