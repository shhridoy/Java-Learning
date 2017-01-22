package sample;
import java.util.Scanner;
import java.util.Random;

public class Sample {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Function obj = new Function("Sasha Grey");
        Function obj2 = new Function("Jenna Haze");
        //System.out.print("Enter your name: ");
        //String temp = input.nextLine();
        //obj.setName(temp);
        obj.Print();
        obj2.Print();
        
        //int age = 23;
        //System.out.println(age > 50 ? "You are old" : "You are young");
        //System.out.println(Math.sqrt(9));
        
        /*Random dice = new Random();
        int num;
        
        for(int i=1; i<=10; i++){
            num = 2 + dice.nextInt(6);
            print(num);
        }*/
        
        print("Index\tValue");
        String arr[] = new String[]{"Robin", "Fahad", "Masud", "Rabbi", "Bisha"};
        for(int i=0; i<arr.length; i++){
            print(i + "\t" + arr[i]);
        }
        
    }
    
    private static void print(String msg){
        System.out.println(msg);
    }
    
    private static void print(int a){
        System.out.println(a);
    }
    
    private static void print(double a){
        System.out.println(a);
    }
}
