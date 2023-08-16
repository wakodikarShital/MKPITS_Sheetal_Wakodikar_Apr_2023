package Task1;

public class FullTimeEmployee extends Employee {

    int workingHours=8;






    public  void calculateSalary(){
        System.out.println("Salary of full time employee is perDay = " + workingHours*paymentPerHours);

    }
}
