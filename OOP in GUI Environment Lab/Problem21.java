/* 21. (Comparing Strings) Write a program that uses String method compareTo to compare two strings input by the user. 
Output whether the first string is less than, equal to or greater than the second.
*/

import java.util.Scanner;

public class Problem21 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("\nEnter the second string: ");
        String second = input.nextLine();
        
        if (first.compareTo(second) > 0){
            System.out.println(first+" is greater than "+second);
        } else if (first.compareTo(second) < 0){
            System.out.println(first+" is less than "+second);
        } else {
            System.out.println(first+" is equal to than "+second);
        }

    }
    
}

/* OUTPUT:
Enter the first string: hridoy

Enter the second string: Hridoy
hridoy is greater than Hridoy
*/
