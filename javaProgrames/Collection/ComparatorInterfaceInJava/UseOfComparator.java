package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class UseOfComparator {
    public  void useOfComparatorOnTeacher(){
        LinkedList<Teacher> teacherLinkedList=new LinkedList<>();
        Teacher[] teacher= new Teacher[3];
        teacher[0] = new Teacher(2,"Shital","8000");
        teacher[1] = new Teacher(3,"Arya","2000");
        teacher[2] = new Teacher(1,"Richa","4000");

        teacherLinkedList.addAll(Arrays.asList(teacher));
        System.out.println("-----------------------------From User---------------------------");
        for (Teacher teacherList:teacherLinkedList) {
            System.out.println(teacherList);
        }
        System.out.println("-----------------------------Sorted By Name---------------------------");
        Collections.sort(teacherLinkedList,new SortedName());
        for (Teacher teacherList:teacherLinkedList) {
            System.out.println(teacherList);
        }
        System.out.println("-----------------------------Sorted By Salary---------------------------");
        Collections.sort(teacherLinkedList,new SortedSalary());
        for (Teacher teacherList:teacherLinkedList) {
            System.out.println(teacherList);
        }
        System.out.println("-----------------------------Sorted By Id---------------------------");
        Collections.sort(teacherLinkedList, new SortedId());
        for (Teacher teacherList:teacherLinkedList) {
            System.out.println(teacherList);
        }
    }

    public static void main(String[] args) {
        UseOfComparator useOfComparator = new UseOfComparator();
        useOfComparator.useOfComparatorOnTeacher();

    }
}
