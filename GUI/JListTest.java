
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListFrame extends JFrame{
    
    private JList colorList;  //List to display color
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
                                                "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
        Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
    
    public ListFrame(){
        super("JList Test");
        setLayout(new FlowLayout()); //set frame layout
        
        colorList = new JList(colorNames); //create with colorNames
        colorList.setVisibleRowCount(5); //display 5 rows at once
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //do not allow multiple selections
        add(new JScrollPane(colorList)); //add a JScrollPane containing JList to frame
        
        colorList.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
            }
        });
    }
}

public class JListTest {

    
    public static void main(String[] args) {
        
        ListFrame lstfrm = new ListFrame();
        lstfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lstfrm.setLocationRelativeTo(null);
        lstfrm.setSize(350, 150);
        lstfrm.setVisible(true);
        
    }
    
}
