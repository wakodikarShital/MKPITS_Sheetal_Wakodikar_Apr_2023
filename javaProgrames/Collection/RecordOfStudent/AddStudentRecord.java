package RecordOfStudent;

import java.util.LinkedList;
import java.util.Scanner;

public class AddStudentRecord {

//   public String data="";
    Scanner scanner;
    LinkedList<Student> linkedList;

    String name,choice;
    int marks;

    public AddStudentRecord() {
        scanner=new Scanner(System.in);
        linkedList=new LinkedList<Student>();
    }

    public void addRecordOfStudent(){
        do {
            System.out.println("Enter name and marks : ");
            name=scanner.next();
            marks=scanner.nextInt();
           linkedList.add(new Student(name,marks));
            System.out.println("If do you want to add another name so enter yes/no");
            choice=scanner.next();
            if (choice == "yes"){
                linkedList.add(new Student(name,marks));
            }

        }while(choice.equalsIgnoreCase("yes"));

       }
    public  void displayStudentRecord(){
        for (Student student1:linkedList) {
            System.out.println(student1);
        }

    }

    public  void findRecord(){
        int n=scanner.nextInt();
        System.out.println("Display the record on the " + n + "th indexing = "+linkedList.get(n));
    }

    public  void modifiedRecord(){
        System.out.println("Enter the index which one is modify the data = ");
        int number =scanner.nextInt();
        System.out.println("Enter the name");
        name=scanner.next();
        marks=scanner.nextInt();
        System.out.println(linkedList.set(number,new Student(name,marks)));

    }

    public  void deleteRecord(){
        System.out.println("Enter the index which one is remove the data = ");
        int number=scanner.nextInt();
        System.out.println(linkedList.remove(number));
    }

    public  void deleteAllRecord(){
        linkedList.clear();
        System.out.println("Display empty linked list = "+linkedList);
    }
}
