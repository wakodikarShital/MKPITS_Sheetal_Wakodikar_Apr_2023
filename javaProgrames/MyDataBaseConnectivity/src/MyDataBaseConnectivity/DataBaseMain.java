package MyDataBaseConnectivity;

import java.util.Scanner;

public class DataBaseMain {
    public static void main(String[] args) {
//        System.out.println("-------------------output only driver loading and connection stablished---------");
//       DataBaseConnectivity.dataBaseConnection();
//
//        System.out.println("--------insert data ------");
//       DataBaseConnectivity.insertData("8","Ravina","440035","punjab");
//
//        System.out.println("------Display Data-----");
//        DataBaseConnectivity.getOutputDisplay();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - insert data\n2 - display records\n3 - delete record\n4 - modified record");
        System.out.println("Enter your number : ");
        int choice = scanner.nextInt();
        System.out.println();
        switch (choice){
            case 1:
                System.out.println("Enter your Roll number : ");
                String rollNumber = scanner.next();
                System.out.println("Enter your name : ");
                String nameOfStudent = scanner.next();
                System.out.println("Enter your pin : ");
                String pin = scanner.next();
                System.out.println("Enter your city : ");
                String city = scanner.next();
                DataBaseConnectivity.insertData(rollNumber,nameOfStudent,pin,city);
                break;
            case 2:
                DataBaseConnectivity.getOutputDisplay();
                break;
            case 3:
                System.out.println("Enter rollNo for deleting details : ");
                String rollNo = scanner.next();
                DataBaseConnectivity.deleteData(rollNo);
                break;

            case 4:
                DataBaseConnectivity.updateData("7","ashi","548785","ludhiyana");
        }

    }
}
