package overload;

import java.util.Scanner;

class Factorial{
    
    //this is a recursive method
    int fact(int n){
        int result;
        
        if(n==1){
            return 1;
        }
        
        result = fact(n-1) * n;
        return result;
    }
}
    

public class Recursion {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Factorial fc = new Factorial();
        
        System.out.print("Enter the number: ");
        int a = input.nextInt();
        
        System.out.println("Factorial of "+a+" is: "+fc.fact(a));
    }
}

/* OUTPUT:

Enter the number: 5
Factorial of 5 is: 120
 */
