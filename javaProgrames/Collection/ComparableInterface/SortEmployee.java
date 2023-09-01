package ComparableInterface;

import RecordOfStudent.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortEmployee  {
    public  void sortName() {
       LinkedList<Employee> employeeLinkedList = new LinkedList<>();
       Employee[] employee= new Employee[2];
       employee[0] = new Employee(1,"Bhagyashree");
       employee[1]= new Employee(2,"Mrunali");

       employeeLinkedList.addAll(Arrays.asList(employee));
       Collections.sort(employeeLinkedList);
        for (Employee employees:employeeLinkedList) {
            System.out.println(employees);

        }

    }
}
