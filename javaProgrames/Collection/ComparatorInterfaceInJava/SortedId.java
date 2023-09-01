package Comparator;

import ComparableInterface.Employee;

import java.util.Comparator;

public class SortedId implements Comparator<Teacher> {


    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.getId()== o2.getId())
            return 0;
        else if (o1.getId()< o2.getId()) {
            return -1;

        }
        else
            return 1;

    }
}
