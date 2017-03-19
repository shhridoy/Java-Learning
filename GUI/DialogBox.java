package dialogbox;

import javax.swing.JOptionPane;

public class DialogBox {

    public static void main(String[] args) {
        // prompt user to enter name
        String name = JOptionPane.showInputDialog("What's your name?");
        
        // create the message
        String msg = String.format("Welcome, %s, to Java Programming", name);
        
        //display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, msg);
    }
}
