package random;
import java.util.Random;
import java.util.Scanner;

public class RandomGen {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num=0;
        System.out.println("Hi there!");
        Random ran = new Random();
        for(int i=0; i<10; i++){
            num = ran.nextInt(5);
        }
        
        System.out.println(num);
        
    }
}
