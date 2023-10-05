package Encapsulation;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        System.out.println(employee.getEmployeeId());
    }
}
