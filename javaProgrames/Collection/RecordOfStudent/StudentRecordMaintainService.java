package RecordOfStudent;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordMaintainService {


    public void studentRecordMaintain() {
        Scanner scanner = new Scanner(System.in);
        AddStudentRecord addStudentRecord= new AddStudentRecord();


        int choice;
        while (true) {

            System.out.println("Press 1 - Add Record \nPress 2 - Display All Student Records \nPress 3 - Search/Find the particular student record \nPress 4 - Modify The student records \nPress 5 - Delete specified student record \nPress 6 - Delete all student records \nPress 6 - Exit the process of program ");
            System.out.println("\nEnter a number to get particular process = ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    addStudentRecord.addRecordOfStudent();

                case 2:
                    addStudentRecord.displayStudentRecord();
                    break;
                case 3:
                    addStudentRecord.findRecord();
                    break;
                case 4:
                    addStudentRecord.modifiedRecord();
                    break;
                case 5:
                    addStudentRecord.deleteRecord();
                    break;
                case 6:
                    addStudentRecord.deleteAllRecord();
                    break;
                case 7:
                    System.out.println("Exit the process of program");
                    return;


            }
        }
    }
}

