package newjava;
import java.util.Scanner;

public class NewJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,sum, i=0, Case;
        Case = input.nextInt();
        while(i<Case){
            a = input.nextInt();
            b = input.nextInt();
            System.out.println("Case "+(i+1)+": "+(a+b));
            i++;
        }
    }
}
