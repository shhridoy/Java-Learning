/* 3. Create a class called Employee that includes three instance variables—a first name (type String), 
a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. 
Write a program named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/

class Employee {
   
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        
        if (salary >= 0.0){
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
        
    }
    
    public void showData(){
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Salary: "+ salary);
        System.out.println();
    }
    
}

public class Problem3 {

    public static void main(String[] args) {
        
        Employee em1 = new Employee("Md.", "Korim", 10000);
        Employee em2 = new Employee("Rahim", "Uddin", 6000);
        
        double salary1, yearlySalary1, risingSalary1;
        
        em1.showData();
        em2.showData();
        
        salary1 = em1.getSalary();
        yearlySalary1 = salary1 * 12;
        System.out.println("Yearly salary of employee 1: "+yearlySalary1);
        
        double salary2, yearlySalary2, risingSalary2;
        
        salary2 = em2.getSalary();
        yearlySalary2 = salary2 * 12;
        System.out.println("Yearly salary of employee 2: "+yearlySalary2);
        
        risingSalary1 = salary1 * 10 / 100;
        yearlySalary1 = (salary1 + risingSalary1) * 12;
        System.out.println("\nYearly salary of employee 1  after 10% rising: "+yearlySalary1);
        
        risingSalary2 = salary2 * 10 / 100;
        yearlySalary2 = (salary2 + risingSalary2) * 12;
        System.out.println("Yearly salary of employee 2  after 10% rising: "+yearlySalary2);
        
    }
    
}

/* OUTPUT:
First Name: Md.
Last Name: Korim
Salary: 10000.0

First Name: Rahim
Last Name: Uddin
Salary: 6000.0

Yearly salary of employee 1: 120000.0
Yearly salary of employee 2: 72000.0

Yearly salary of employee 1  after 10% rising: 132000.0
Yearly salary of employee 2  after 10% rising: 79200.0
*/
