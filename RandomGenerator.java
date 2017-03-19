package test;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        int val;
        for(int i=1; i<=20; i++){
            val = 1 + rand.nextInt(6);
            System.out.printf("%d ", val);
            
            // if i is divisible by 5, start a new line of output
            if(i%5 == 0){
                System.out.println();
            }
        }
    }
}
