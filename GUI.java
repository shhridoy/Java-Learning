/** In computer science, a graphical user interface or GUI, pronounced ("gooey") 
 * is a type of interface that allows users to interact with electronic devices through graphical icons and 
 * visual indicators such as secondary notation, as opposed to text-based interfaces, typed command labels or text navigation. **/

package learn;
import javax.swing.JOptionPane; //import class for GUI

public class GUI {

    public static void main(String[] args) {
        
        //Input popup dialog box 
        String fn = JOptionPane.showInputDialog("Enter First Number"); 
        String sn = JOptionPane.showInputDialog("Enter Second Number");
        
        int num1 = Integer.parseInt(fn); //string to integer
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is "+sum, "The title", JOptionPane.PLAIN_MESSAGE); //Show popup dialogue
        
    }
}
