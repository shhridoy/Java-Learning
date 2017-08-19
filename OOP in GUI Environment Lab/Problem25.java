/* 25. (Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes the line using space 
characters as delimiters and outputs only those words beginning with the letter "b".
*/

import java.util.Scanner;

public class Problem25 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
	System.out.println("Enter a String");
	String text = input.nextLine();
        String[] splited = text.split("\\s+");
        
        System.out.println("The tag with 'b'");
	for (String s: splited) {
            if (s.startsWith("b")){
                System.out.println(s);
            }
        }
	
    }
    
}

/* OUTPUT:
Enter a String
Hi am bi by bare
The tag with 'b'
bi
by
bare
*/
