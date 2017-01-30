/** Polymorphism is the ability of an object to take on many forms. 
 * The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. 
 * Any Java object that can pass more than one IS-A test is considered to be polymorphic. **/

package learn;

public class Polymorphism {

    public static void main(String[] args) {
         PolymorphismClassFood obj[] = new PolymorphismClassFood[2];
         obj[0] = new PolymorphismClass();
         obj[1] = new PolymorphismClass2();
         
         for(int x=0; x<2; x++){
             obj[x].eat();
         }
    }
}

/* OUTPUT: 
 * This Class food is great.
 * This Class 2 food is great. */