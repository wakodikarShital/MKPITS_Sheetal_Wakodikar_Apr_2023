package Task1;

public class Contractor extends Employee {
    int workingHours = 5;




    public void calculateSalary(){
        System.out.println("Salary of Contractor perDay = " + workingHours*paymentPerHours);


    }
}
