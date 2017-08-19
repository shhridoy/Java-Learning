/* 24. (Searching Strings) Write an application that inputs a line of text and a search character and uses String method 
indexOf to determine the number of occurrences of the character in the text.
*/

// UN-DONE
import java.util.Scanner;

public class Problem11 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Enter your text here");
        String text = input.nextLine();
        System.out.println("Enter your search character");
        char ch = input.next(".").charAt(0);
        int match = 0;
        
        int in = text.indexOf(ch);
        
        System.out.println("Number of matches is: "+in);
	
    }
    
}

*/ OUTPUT:
Enter your text here
hi there
Enter your search character
t
Number of matches is: 3
*/
