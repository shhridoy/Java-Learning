/* 6. (Sales Commission Calculator) A large company pays its salespeople on a commission basis. 
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, 
a salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, 
or a total of $650. You’ve been supplied with a list of the items sold by each salesperson. 
The values of these items are as follows:
Item     Value
1        239.99
2        129.75
3        99.95
4        350.89
Write a program that inputs one salesperson’s items sold for last week and calculates and displays 
that salesperson’s earnings. There’s no limit to the number of items that can be sold.
*/

import java.util.Scanner;

class SCC {
   
    private int item[];
    private double value[];
    private final double pay = 200;

    public SCC(int[] item, double[] value) {
        this.item = item;
        this.value = value;
    }
    
    public double getEarnings(){
        double totalSale = 0;
        for(int i=0; i<value.length; i++){
            totalSale += value[i];
        }
        double totalEarns = pay + ((totalSale*9)/100);
        return totalEarns;
    }
    
    public void displayItems(){
        System.out.println("Item\tValue");
        for(int i=0; i<item.length; i++){
            System.out.println(item[i] + "\t" + value[i]);
        }
    }
    
}

public class DateTest {
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter the number of sells items: ");
        int no = sc.nextInt();
        
        int item[] = new int[no];
        double value[] = new double[no];
        
        System.out.println("Item\tValue");
        for (int i=0; i<no; i++){
            item[i] = i+1;
            System.out.print(item[i]+"\t");
            value[i] = sc.nextDouble();
        }

        SCC obj = new SCC (item, value);
        System.out.println ("\nTotal earning in this week: "+obj.getEarnings());
        
    }
}

/* OUTPUT:
Enter the number of sells items: 4
Item	 Value
1	     239.99
2	     129.75
3	     99.95
4	     350.89

Total earning in this week: 273.8522
*/
