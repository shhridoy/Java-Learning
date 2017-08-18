/* 12. (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. 
Provide methods that calculate the rectangle’s perimeter and area. It has set and get methods for both length and width. 
The set methods should verify that length and width are each floating-point numbers larger than 0.0 and 
less than 20.0.Write a program to test class Rectangle.
*/

import java.util.Scanner;

class Rectangle {
    
    private double length;
    private double width;

    /*public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }*/

    public Rectangle() {
        length = width =  1;
    }
    
    public double perimeter () {
        return 2 * ( length + width);
    }
    
    public double area () {
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (check(length)){
            this.length = length;
        } else {
            System.out.println("Length should less than 20 and greater than 0");
            //this.length = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (check(width)){
            this.width = width;
        } else {
            System.out.println("Width should less than 20 and greater than 0");
            
        }
    }
    
    public boolean check (double val){
        if (val < 20 && val > 0){
            return true;
        } else {
            return false;
        }
    }
}

public class Problem11 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Enter width and length (width and length must be less than 20 or greater than 0)");

            double w, l;

            w = input.nextDouble();
            l = input.nextDouble();
            
            Rectangle rec = new Rectangle();
            if (rec.check(w) && rec.check(l)){
                rec.setLength(l);
                rec.setWidth(w);
                System.out.println(rec.area());
                System.out.println(rec.perimeter());
                break;
            }       
        }
    }
}

/* OUTPUT:
Enter width and length (width and length must be less than 20 or greater than 0)
21
1
Enter width and length (width and length must be less than 20 or greater than 0)
12
1
12.0
26.0
*/
