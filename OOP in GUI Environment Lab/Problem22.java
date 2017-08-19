/* 22. (Comparing Portions of Strings) Write a program that uses String method regionMatches to compare two strings 
input by the user. The application should input the number of characters to be compared and the starting index of the comparison. 
The application should state whether the strings are equal. Ignore the case of the characters when performing the comparison.
*/

import java.util.Scanner;

public class Problem22 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
	System.out.println("Enter the value of 1st String");
	String Str1 = input.nextLine();
	System.out.println("Enter the value of second String");
	String Str2 = input.nextLine();
	
	System.out.println("Enter the value of 1st string startIndex");
	int a = input.nextInt();
	System.out.println("Enter the value of 2st string startIndex");
	int c = input.nextInt();
	System.out.println("Enter the value of length");
	int d = input.nextInt();
	
        /* regionMatches(
                         index_of_source_where_comparison_starts, destinatio_string, 
                         index_from_where comparison_sould_start, no_of_character_to_compare
                        )

        */
        
	boolean b = Str1.regionMatches(a, Str2, c, d);
        
	System.out.println("Return value is: "+b);
    }
    
}

/* OUTPUT:
Enter the value of 1st String
I am hridoy
Enter the value of second String
I am lembu
Enter the value of 1st string startIndex
0
Enter the value of 2st string startIndex
0
Enter the value of length
5
Return value is: true
*/
