package carclass;

public class CarClass {

    private int aNumber = 12;
    static private Car ourCar= new Car();
    static private Car ourAnotherCar;
    public static void main(String[] args) {
        // TODO code application logic here
        ourAnotherCar = new Car("TOYOTA", "Alien", "qwery", 1500, 30);
        
        SubCar ourSubCar = new SubCar("BMW", "4 series", "dksljfl", 345, 201.1, 1000, "grey");
        
        System.out.println("Manufacturer: "+ourAnotherCar.manufacturerName);
        System.out.println("Model: "+ourAnotherCar.getModelName());
        System.out.println("Password Match: "+ourAnotherCar.matchPassWord("jdflsfkja"));
        
        System.out.println("First Car name: "+ourCar.engineCC);
        System.out.println("Second Car name: "+ourAnotherCar.engineCC);
        System.out.println("Manufacturer: "+ourCar.matchPassWord("myname"));
        
    }
}
