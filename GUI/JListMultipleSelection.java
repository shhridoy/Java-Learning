import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MultipleSelectionFrame extends JFrame{
    
    private JList colorList;  //List to display color
    private JList copyList;  //list to copy color names into
    private JButton copybtn;  //button to copy selected names
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
                                                "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
        Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
    
    public MultipleSelectionFrame(){
        super("Multiple Selection Lists");
        setLayout(new FlowLayout()); //set frame layout
        
        colorList = new JList(colorNames); //create with colorNames
        colorList.setVisibleRowCount(5); //display 5 rows at once
        colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //allow multiple selections
        add(new JScrollPane(colorList)); //add a JScrollPane containing JList to frame
        
        copybtn = new JButton("Copy >>>");
        copybtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                copyList.setListData(colorList.getSelectedValues());
            }
        });
        
        add(copybtn);
        
        copyList = new JList();
        copyList.setVisibleRowCount(5);
        copyList.setFixedCellWidth(100);
        copyList.setFixedCellHeight(15);
        copyList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyList)); //add list with scrollpane
    }
}

public class JListMultipleSelection {

    public static void main(String[] args) {
        
        MultipleSelectionFrame lstfrm = new MultipleSelectionFrame();
        lstfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lstfrm.setLocationRelativeTo(null);
        lstfrm.setSize(350, 150);
        lstfrm.setVisible(true);
    }
}
