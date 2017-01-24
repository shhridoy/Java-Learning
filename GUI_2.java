/** In computer science, a graphical user interface or GUI, pronounced ("gooey") 
 * is a type of interface that allows users to interact with electronic devices through graphical icons and 
 * visual indicators such as secondary notation, as opposed to text-based interfaces, typed command labels or text navigation. **/

package learn;
import javax.swing.JFrame;

public class GUI_2 {

    public static void main(String[] args) {
        
        GUI_2Class obj = new GUI_2Class();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(275, 180);
        obj.setVisible(true);
    }
}
