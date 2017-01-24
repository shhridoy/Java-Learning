/** An event handler typically is a software routine that processes actions such as keystrokes and mouse movements. 
 *  With Web sites, event handlers make Web content dynamic.  **/

package learn;

import javax.swing.JFrame;

public class GUI_EventHandler {

    public static void main(String[] args) {
         
        GUI_EventHandlerClass obj = new GUI_EventHandlerClass();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(350, 100);
        obj.setVisible(true);
    }
}
