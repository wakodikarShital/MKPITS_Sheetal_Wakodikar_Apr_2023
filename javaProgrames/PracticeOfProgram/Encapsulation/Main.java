package Encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------- Student Details -------------------- ");
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setRollNo(1);
        studentInfo.setStudentName("Shital");
        System.out.println("roll no = " + studentInfo.getRollNo());
        System.out.println("Student Name = " + studentInfo.getStudentName());

        System.out.println("---------------------------- Teacher Details -------------------- ");
        TeacherDetails teacherDetails = new TeacherDetails();
        teacherDetails.setId(1);
        teacherDetails.setName("Shital");
        teacherDetails.setAddress("Tandapeth");
        teacherDetails.setCity("Nagpur");
        teacherDetails.setEmail("shital123@gmail.com");
        teacherDetails.setSalary(30000.00);

        System.out.println("Id : "+teacherDetails.getId()+"\n"+"Name : "+teacherDetails.getName()+"\n"+"Address : "+teacherDetails.getAddress()+"\n"+"City : "+teacherDetails.getCity()+"\n"+"Email : "+teacherDetails.getEmail()+"\n"+"Salary : "+teacherDetails.getSalary());

        System.out.println("---------------------------- Employee Details -------------------- ");

        EmployeeDetailsFromUser employeeDetailsFromUser = new EmployeeDetailsFromUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id : ");
        int id = scanner.nextInt();
        System.out.println("Enter Name : ");
        String name = scanner.next();
        System.out.println("Enter Salary : ");
        double salary = scanner.nextDouble();

        employeeDetailsFromUser.setId(id);
        employeeDetailsFromUser.setName(name);
        employeeDetailsFromUser.setSalary(salary);

        System.out.println("Id : "+employeeDetailsFromUser.getId()+"\n"+"Name : "+employeeDetailsFromUser.getName()+"\n"+"Salary : "+employeeDetailsFromUser.getSalary());


        System.out.println("----------------- without declaring variable -----------------------");
        /**
         * Without declaring variable
         * we can get the input from user
         */

        System.out.println("Enter Id : ");
        employeeDetailsFromUser.setId(scanner.nextInt());
        System.out.println("Enter Name : ");
        employeeDetailsFromUser.setName(scanner.next());
        System.out.println("Enter Salary : ");
        employeeDetailsFromUser.setSalary(scanner.nextDouble());

        System.out.println("Id : "+employeeDetailsFromUser.getId()+"\n"+"Name : "+employeeDetailsFromUser.getName()+"\n"+"Salary : "+employeeDetailsFromUser.getSalary());









    }


}
