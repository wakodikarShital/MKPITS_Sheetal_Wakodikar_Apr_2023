package Comparator;

import java.util.Comparator;

public class SortedSalary implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
