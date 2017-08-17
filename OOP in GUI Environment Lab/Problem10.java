/* 10. (Enforcing Privacy with Cryptography) The explosive growth of Internet communications and data storage on 
Internet-connected computers has greatly increased privacy concerns. 
The field of cryptography is concerned with coding data to make it difficult 
(and hopefully—with the most advanced schemes—impossible) for unauthorized users to read. 

A company that wants to send data over the Internet has asked you to write a program that will encrypt it so that 
it may be transmitted more securely. All the data is transmitted as four-digit integers. Your program should read a 
four-digit integer entered by the user and encrypt it as follows:
 Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10. 
 Then swap the first digit with the third, and swap the second digit with the fourth. Then print the encrypted integer. 
Write a separate program that inputs an encrypted four-digit integer and decrypts it (by reversing the encryption scheme) 
to form the original number.
*/

import java.util.Scanner;

public class Problem10 {
    
    private static Scanner sc = new Scanner(System.in);
    private static final int SIZE = 4;
    private static int a[] = new int[SIZE];
    private static int sum = 0, reminder;

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Enter the 4 digit number");
            int data = sc.nextInt();
            String s = Integer.toString(data);
            if(s.length() == 4){
                encrypt(s);
                decrypt();
                break;
            }
        }
    }
    
    private static void encrypt(String s){
        for (int i=0; i<SIZE; i++){
            char c = s.charAt(i);
            a[i] = Character.getNumericValue(c);
            a[i] += 7; 
            sum += a[i];
        }
        
        reminder = sum/10;
    }
    
    private static void decrypt(){
        int temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        
        int temp2 = a[1];
        a[1] = a[3];
        a[3] = temp2;
        
        System.out.print("Encrypted integer is: ");
        for(int x: a){
            System.out.print(x);
        }
        System.out.println();
    }
    
}

/* OUTPUT:
Enter the 4 digit number
34553
Enter the 4 digit number
1234
Encrypted integer is: 101189
*/
