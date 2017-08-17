/* 9. (Printing the Decimal Equivalent of a Binary Number) Write a program that inputs an integer containing only 0s and 1s 
(i.e., a binary integer) and prints its decimal equivalent. [Hint: Use the remainder and division operators to pick off 
the binary number’s digits one at a time, from right to left. In the decimal number system, 
the rightmost digit has a positional value of 1 and the next digit to the left a positional value of 10, then 100, 
then 1000, and so on. The decimal number 234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. 
In the binary number system, the rightmost digit has a positional value of 1, the next digit to the left a 
positional value of 2, then 4, then 8, and so on. The decimal equivalent of 
binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
*/

import java.util.Scanner;

public class Problem9 {
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //simpleConversion();
        print("Enter a binary integer: ");
        int num = sc.nextInt();
        System.out.println ("Decimal equivalent is: "+BinaryToDecimal(num));
        
    }
    
    public static int BinaryToDecimal(int binaryNumber) {

        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }
        return decimal;
    }
    
    private static void simpleConversion() {
        print("Enter a binary integer: ");
        String b = sc.nextLine();
        int answer = Integer.parseInt(b, 2);
        System.out.println("Decimal equivalent is " + answer + ".");
    }

    private static void print(String s) {
        System.out.print(s);
    }
    
}

/* OUTPUT:
Enter a binary integer: 1101
Decimal equivalent is: 13
*/
