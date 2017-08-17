/* 7. (Find the Largest Number) The process of finding the largest value is used frequently in computer applications. 
For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. 
The salesperson who sells the most units wins the contest.
Write a program that inputs a series of 10 integers and determines and prints the largest integer. 
Your program should use at least the following three variables:
a) counter: A counter to count to 10 
(i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.
*/

import java.util.Scanner;

class LargestNumber {
    private int number[];
    private int largestNumber;

    public LargestNumber (int num[]) {
        number = num;
    }
    
    public int getLargestNumber () {
        
        largestNumber = number[0];
        for (int i=1; i<number.length; i++) {
            if (number[i] > largestNumber) {
                largestNumber = number[i];
            }
        }
        
        return largestNumber;
    }
    
}


public class Problem7 {
    
    private static Scanner sc = new Scanner(System.in);
    private static final int LIMIT = 10;

    public static void main(String[] args) {
        
        int number[] = new int[LIMIT];
        
        System.out.println("Enter 10 values");
        for (int i=0; i<LIMIT; i++){
            number[i] = sc.nextInt();
        }
        
        LargestNumber lm = new LargestNumber(number);
        System.out.println("\nLargest Value is: "+lm.getLargestNumber());
        
    }
}

/* OUTPUT:
Enter 10 values
122
12
3
4
5
6
78
9
65
32

Largest Value is: 122
*/
