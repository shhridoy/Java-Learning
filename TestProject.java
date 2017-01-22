package testproject;
import java.util.Scanner;
import java.util.*;

public class TestProject {

    private static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] fruit = {"Apple", "Orange", "Mango", "Grape", "Lemon"};
        List<String> list = new LinkedList<String>();
        
        for(String x : fruit){
            list.add(x);
        }
        
        String[] fruit2 = {"Jackfruit", "Guava", "Coconut"};
        List<String> list2 = new LinkedList<String>(); 
        for(String y : fruit2){
            list2.add(y);
        }
        
        list.addAll(list2);
        list2 = null;
        
        
    }
}
