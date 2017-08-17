/* 5. (Credit Limit Calculator) Write a program that determines whether any of several department-store customers 
has exceeded the credit limit on a charge account. For each customer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits),
display the new balance and determine whether the new balance exceeds the customer’s credit limit. 
For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
*/

public class CLC {
   
    private int accountNo;
    private int bgnBalance;
    private int charge;
    private int credit;
    private int creditLimit;
    private int newBalance;

    public CLC(int accountNo, int bgnBalance, int charge, int credit, int creditLimit) {
        this.accountNo = accountNo;
        this.bgnBalance = bgnBalance;
        this.charge = charge;
        this.credit = credit;
        this.creditLimit = creditLimit;
        calculateNewBal();
    }
    
    private void calculateNewBal(){
        newBalance = bgnBalance + charge - credit;
    }
    
    public int getNewBalance(){
        return newBalance;
    }
    
    public void showNewBalance(){
        if (newBalance > creditLimit){
            System.out.println("Credit limit exceeded!");
        } else {
            System.out.println("*New balance is*: "+newBalance);
        }
    }
    
    public void showCustomerData(){
        System.out.println("Account No: "+accountNo);
        System.out.println("Balance at the beginning of the month: "+bgnBalance);
        System.out.println("Total of all items charged by the customer: "+charge);
        System.out.println("Total of all credits applied to the customer’s account: "+credit);
        System.out.println("Credit Limit: "+creditLimit+"\n");
    }
    
}

public class Problem5 {

    public static void main(String[] args) {
        
        CLC ob1= new CLC(1, 5000, 5000, 6000, 5000);
        ob1.showCustomerData();
        ob1.showNewBalance();
        
    }
}

/* OUTPUT:
Account No: 1
Balance at the beginning of the month: 5000
Total of all items charged by the customer: 5000
Total of all credits applied to the customer’s account: 6000
Credit Limit: 5000

*New balance is*: 4000
*/
