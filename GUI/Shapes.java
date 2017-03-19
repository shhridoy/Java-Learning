package shapetest;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
    private int choice; //user choice of which shape of draw
    
    public Shapes(int userChoice){
        choice = userChoice;
    }
    
    //draws a cascade of shapes starting from the top-left corner
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0; i<10; i++){
            switch(choice){
                case 1: // draw rectangles
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2: // draw ovals
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
            }
        }
    }
}
