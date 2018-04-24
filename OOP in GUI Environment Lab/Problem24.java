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
        
        System.out.print("Character found at position: ");
	for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) == ch) {
                match++;
                System.out.print(i+"  ");
            }
        }
        
        System.out.println("\nNumber of matches occured: "+match);
	
    }
    
}

*/ OUTPUT:
Enter your text here
Shahin
Enter your search character
h
Character found at position: 1  3  
Number of matches occured: 2
*/
