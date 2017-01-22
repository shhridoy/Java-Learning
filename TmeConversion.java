package tmeconversion;


public class TmeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyClass object = new MyClass();
        MyClass object1 = new MyClass(3);
        MyClass object2 = new MyClass(4, 56);
        MyClass object3 = new MyClass(2, 34, 45);
        System.out.printf("%s\n", object.toMilitary());
        System.out.printf("%s\n", object1.toMilitary());
        System.out.printf("%s\n", object2.toMilitary());
        System.out.printf("%s\n", object3.toMilitary());
        
        System.out.printf("\n%s\n", object.toString());
        System.out.printf("%s\n", object1.toString());
        System.out.printf("%s\n", object2.toString());
        System.out.printf("%s\n", object3.toString());
    }
}
