/** Polymorphism is the ability of an object to take on many forms. 
 * The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. 
 * Any Java object that can pass more than one IS-A test is considered to be polymorphic. **/

package learn;

public class Polymorphism2 {

    public static void main(String[] args) {
         Polymorphism2ClassFat obj = new Polymorphism2ClassFat();
         Polymorphism2ClassFood food = new Polymorphism2ClassFood();
         Polymorphism2ClassFood fo = new Polymorphism2Class();
         
         
         obj.digest(food); //passing class Polymorphism2ClassFood object 
         obj.digest(fo); 
    }
}

/* OUTPUT: 
 * This Class food is great.
 * This Class 2 food is great. */