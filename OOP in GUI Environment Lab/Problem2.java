/* 2. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. 
An Invoice should include four pieces of information as instance variables—a part number (type String), 
a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). 
Your class should have a constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable. 
In addition, provide a method named getInvoiceAmount that calculates the invoice amount 
(i.e., multiplies the quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. If the price per item is not positive, 
it should be set to 0.0. Write a program named InvoiceTest that demonstrates class Invoice’s capabilities.
*/

package invoicetest;

class Invoice {
    
    private String part_num;
    private String part_des;
    private int quantity;
    private double item_price;
    
    public Invoice(){
       msg();
    }

    public Invoice(String part_num, String part_des, int purchased_item, double item_price) {
        this.part_num = part_num;
        this.part_des = part_des;
        this.quantity = purchased_item;
        this.item_price = item_price;
        msg();
    }
    
    public double getInvoiceAmount(){
        if(quantity > 0 && item_price > 0.0){
            return quantity*item_price;
        } else{
            msg();
            return 0;
        }
    }

    public String getPart_num() {
        return part_num;
    }

    public void setPart_num(String part_num) {
        this.part_num = part_num;
    }

    public String getPart_des() {
        return part_des;
    }

    public void setPart_des(String part_des) {
        this.part_des = part_des;
    }

    public int getQuantity() {
        if(quantity >= 0){
            return quantity;
        } else{
            msg();
            return 0;
        }
        
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItem_price() {
        if(item_price >= 0){
            return item_price;
        } else{
            msg();
            return 0.0;
        }
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }
    
    private void msg(){
        if(quantity <= 0){
            System.out.println("Quantity is zero or negative");
        }
        if(item_price <= 0){
            System.out.println("Item price is zero or negative");
        }
    }
    
}

public class Problem2 {

    public static void main(String[] args) {
        
        Invoice obj1 = new Invoice("123MN", "Mini Computer", 8, 23000);
        double amount = obj1.getInvoiceAmount();
        System.out.println(amount);
        
        obj1.setItem_price(-5.0);
        System.out.println(obj1.getInvoiceAmount());
    }   
}

/* OUTPUT:
184000.0
Item price is zero or negative
0.0
*/
