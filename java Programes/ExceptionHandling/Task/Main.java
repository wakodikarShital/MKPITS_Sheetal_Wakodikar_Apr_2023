import Interface.TwoWheeler;
import Task1.Contractor;
import Task1.FullTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Contractor contractor= new Contractor();
        contractor.setName("Shital Wakodikar");
        contractor.setPaymentPerHours(350);
        System.out.println(contractor.getName()+ " Payment Per Hours = " + contractor.getPaymentPerHours());
        contractor.calculateSalary();


        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setName("Tejswini Wannewar");
        fullTimeEmployee.setPaymentPerHours( 400);
        System.out.println(fullTimeEmployee.getName()+ " Payment Per Hours = " + fullTimeEmployee.getPaymentPerHours());

        fullTimeEmployee.calculateSalary();




    }
}