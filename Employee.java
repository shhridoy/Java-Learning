package employee;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;
    
    public Employee(String name){
        this.name = name;
    }
    
    public void empAge(int empAge){
        age = empAge;
    }
    
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    
    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
        
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahim");
        Employee emp2 = new Employee("Karim");
        
        emp1.empAge(29);
        emp1.empDesignation("Senior Software Engineer");
        emp1.empSalary(40000.00);
        emp1.printEmployee();
        
        emp2.empAge(25);
        emp2.empDesignation("Software Engineer");
        emp2.empSalary(25000.00);
        emp2.printEmployee();
    }
}
