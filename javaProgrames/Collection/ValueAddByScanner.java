import java.util.LinkedList;
import java.util.Scanner;

public class ValueAddByScanner {
    public void takeValueFromUser(){
        Scanner scanner=new Scanner(System.in);
        LinkedList linkedList=new LinkedList<>();
        String name ,choice;



        do {
            System.out.println("Enter name : ");
            name=scanner.next();
            linkedList.add(name);

            System.out.println("If do you want to add another name so enter yes/no");
            choice=scanner.next();
            if (choice == "yes"){

            }

        }while(choice.equalsIgnoreCase("yes"));

        for (Object o:linkedList) {
            System.out.println(o);
        }


    }

    //---------------------------------------------------------By Student object------------------------------------------

    public void takeValueFromUserByStudentObject(){
        System.out.println("-------------------------------By Student object------------------------------");
        Scanner scanner=new Scanner(System.in);
        LinkedList<Student> linkedList=new LinkedList<>();
        Student student=new Student();
        String name ,choice;
        int marks;


        do {
            System.out.println("Enter name and marks : ");
            name=scanner.next();
            marks=scanner.nextInt();
            linkedList.add(new Student(name,marks));

            System.out.println("If do you want to add another name so enter yes/no");
            choice=scanner.next();
            if (choice == "yes"){

            }

        }while(choice.equalsIgnoreCase("yes"));

        for (Object
                object:linkedList) {
            System.out.println(object);
        }


    }


    public static void main(String[] args) {
        ValueAddByScanner valueAddByScanner = new ValueAddByScanner();
        valueAddByScanner.takeValueFromUser();
        valueAddByScanner.takeValueFromUserByStudentObject();
    }
}
