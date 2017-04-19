package learn;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener; //for listening 
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

class GUI_EventHandlerClass extends JFrame{
    
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;
    
    public GUI_EventHandlerClass(){
        super("The Title");
        setLayout(new FlowLayout());
        
        item1 = new JTextField(10);
        add(item1);
        
        item2 = new JTextField("Enter text here");
        add(item2);
        
        item3 = new JTextField("Uneditable", 20);
        item3.setEditable(false);
        add(item3);
        
        passwordField = new JPasswordField("My Password");
        add(passwordField);
        
        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    
    private class theHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            String string = ""; //initialize 
            
            if(event.getSource() == item1){
                string = String.format("Text field 1: %s", event.getActionCommand());
            }
            else if(event.getSource() == item2){
                string = String.format("Text field 2: %s", event.getActionCommand());
            }
            else if(event.getSource() == item3){
                string = String.format("Text field 3: %s", event.getActionCommand());
            }
            else if(event.getSource() == passwordField){
                string = String.format("Password field is: %s", event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, string);
        }
    }
}

public class GUITextPassHandler {

    public static void main(String[] args) {
         
        GUI_EventHandlerClass obj = new GUI_EventHandlerClass();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null); // show JFrame on middle point of screen
        obj.setSize(350, 100);
        obj.setVisible(true);
    }
}
