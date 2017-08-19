/* 23.(Displaying Strings in Uppercase and Lowercase) Write an application that inputs a line of text and outputs the text 
twice—once in all uppercase letters and once in all lowercase letters.
*/

import java.util.Scanner;

public class Problem11 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Enter your text here");
        String text = input.nextLine();
        
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
	
    }
    
}

/* OUTPUT:
Enter your text here
My name is Robert
MY NAME IS ROBERT
my name is robert
*/
