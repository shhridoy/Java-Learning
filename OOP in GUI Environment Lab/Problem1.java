/*1. Write a program that inputs one number consisting of five digits from the user, 
separates the number into its individual digits and prints the digits separated from one another by three spaces each. 
For example, if the user types in the number 42339, the program should print **
    4   2   3   3   9
*/

import java.util.Scanner;

public class Problelm1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        String s = Integer.toString(num);
        
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i)+"   ");
        }
        System.out.println();
    }
    
}

/* 
OUTPUT:
23415
2   3   4   1   5  
*/
