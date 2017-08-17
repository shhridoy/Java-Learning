/* 4. Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int). 
Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. 
Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, 
day and year separated by forward slashes (/). 
Write a program named DateTest that demonstrates class Date’s capabilities.
*/

class Date {
   
    private int month, day, year;

    public Date (int month, int day, int year) {
        if (month <= 12 && month > 0){
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }
        
        if (day > 0 && day <= 31){
            this.day = day;
        } else {
            System.out.println("Invalid Day");
        }
        
        if (year >= 0){
            this.year = year;
        } else {
            System.out.println("Invalid Year");
        }
    }
    
    public void showDate(){
        if ( month == 0 || day == 0 || year == 0){
            System.out.println("You must enter a valid date");
        } else {
            System.out.println("Date is: "+month+"/"+day+"/"+year);
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 12 && month > 0){
            this.month = month;
        } else {
            System.out.println("Invalid Month");
            this.month = 0;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31){
            this.day = day;
        } else {
            System.out.println("Invalid Day");
            this.day = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0){
            this.year = year;
        } else {
            System.out.println("Invalid Year");
            this.year = 0;
        }
    }
}

public class Problem4 {

    public static void main(String[] args) {
        
        Date date = new Date(8, 18, 2017);
        date.showDate();
        
        date = new Date (13, 33, 2013);
        date.showDate();
    }
}

/* OUTPUT:
Date is: 8/18/2017
Invalid Month
Invalid Day
You must enter a valid date
*/
