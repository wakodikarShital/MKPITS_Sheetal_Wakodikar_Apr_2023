package Overrriding;

public class Employee extends Devloper{
    @Override
    public void typeOfSalary(){
        System.out.println("The  type of Salary is cash");

    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.typeOfSalary();
    }
}
