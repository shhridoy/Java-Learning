package array;
//import java.util.Random;

public class Time {

    public static void main(String[] args) {
        NewClass obj = new NewClass();
        
        System.out.println(obj.toMilitary());
        System.out.println(obj.toString());
        
        obj.setTime(13, 27, 6);
        
        System.out.println(obj.toMilitary());
        System.out.println(obj.toString());
    }
    
    
}
