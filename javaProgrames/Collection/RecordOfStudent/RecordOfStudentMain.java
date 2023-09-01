package RecordOfStudent;

import java.util.Scanner;

public class RecordOfStudentMain {
    public static void main(String[] args) {
//      System.out.println("Press 1 - Add Record \nPress 2 - Display All Student Records \nPress 3 - Search/Find the particular student record \nPress 4 - Modify The student records \nPress 5 - Delete specified student record \nPress 6 - Delete all student records \nPress 6 - Exit the process of program ");
//        Scanner scanner = new Scanner(System.in);

        StudentRecordMaintainService studentRecordMaintainService= new StudentRecordMaintainService();
        studentRecordMaintainService.studentRecordMaintain();
    }
}
