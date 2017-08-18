/* 14. Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square. 
Use Quadrilateral as the superclass of the hierarchy. Create and use a Point class to represent the points in each shape. 
Make the hierarchy as deep (i.e., as many levels) as possible. Specify the instance variables and methods for each class. 
The private instance variables of Quadrilateral should be the x-y coordinate pairs for the four endpoints of the Quadrilateral.
Write a program that instantiates objects of your classes and outputs each object’s area (except Quadrilateral).
*/


class Point {
    
    private int distanceX, distanceY;
    private int x0, x1, y0, y1;

    public Point(int x0, int x1, int y0, int y1) {
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
        setDistanceX();
        setDistanceY();
    }

    private void setDistanceX() {
        if (x1 > x0){
            distanceX = x1 - x0;
        } else {
            distanceX = x0 - x1;
        }
    }

    public int getDistanceX() {
        return distanceX;
    }

    private void setDistanceY() {
        if (y1 > y0){
            distanceY = y1 - y0;
        } else {
            distanceY = y0 - y1;
        }
    }

    public int getDistanceY() {
        return distanceY;
    }
 
}

class Quadrilateral {

    Point point;

    public Quadrilateral(int x0, int x1, int y0, int y1) {
        point = new Point(x0, x1, y0, y1);
    }

    protected int getDistanceX() {
        return point.getDistanceX();
    }

    protected int getDistanceY() {
        return point.getDistanceX();
    }
}

class Square extends Quadrilateral {

    private int area;

    public Square(int x0, int x1, int y0, int y1) {
        super(x0, x1, y0, y1);
        setArea();
    }

    private void setArea() {
        area = super.getDistanceX() * super.getDistanceY();
    }

    public int getArea() {
        return area;
    }
}

class Rectangle extends Quadrilateral {

    private int area;

    public Rectangle(int x0, int x1, int y0, int y1) {
        super(x0, x1, y0, y1);
        setArea();
    }

    private void setArea() {
        area = super.getDistanceX() * super.getDistanceY();
    }

    public int getArea() {
        return area;
    }
}

class Trapezoid extends Quadrilateral {

    private int area;

    public Trapezoid (int x0, int x1, int y0, int y1) {
        super(x0, x1, y0, y1);
        setArea();
    }

    private void setArea() {
        area = ((super.getDistanceX() + super.getDistanceX()) * super.getDistanceY()) / 2;
    }

    public int getArea() {
        return area;
    }
}

class Parallelogram extends Quadrilateral {

    private int area;

    public Parallelogram (int x0, int x1, int y0, int y1) {
        super(x0, x1, y0, y1);
        setArea();
    }

    private void setArea() {
        area = super.getDistanceX() * super.getDistanceY();
    }

    public int getArea() {
        return area;
    }
}

public class Problem14 {

    public static void main(String[] args) {
        
        Square sq = new Square( 5, 3, 5, 3 );
        Rectangle rec = new Rectangle( 5, 2, 1, 3 );
        Trapezoid trap = new Trapezoid( 3, 5, 5, 7 );
        Parallelogram para = new Parallelogram( 6, 3, 1, 3 );
        
        System.out.println("Area of Square is: "+sq.getArea());
        System.out.println("Area of Rectangle is: "+rec.getArea());
        System.out.println("Area of Trapezoid is: "+trap.getArea());
        System.out.println("Area of Parallelogram is: "+para.getArea());

    }
    
}

/* OUTPUT:
Area of Square is: 4
Area of Rectangle is: 9
Area of Trapezoid is: 4
Area of Parallelogram is: 9
*/
