package tmeconversion;


public class TmeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TmeConversionClass object = new TmeConversionClass();
        TmeConversionClass object1 = new TmeConversionClass(3);
        TmeConversionClass object2 = new TmeConversionClass(4, 56);
        TmeConversionClass object3 = new TmeConversionClass(2, 34, 45);
        
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
