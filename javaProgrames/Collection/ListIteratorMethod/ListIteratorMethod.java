package ListIteratorMethod;

import java.util.*;

public class ListIteratorMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("------------------Forward Traversing-----------------------");
       ListIterator listIterator = list.listIterator();
       while (listIterator.hasNext()){
           System.out.println(listIterator.next());
       }

        System.out.println("------------------Reverse Traversing-----------------------");

       while (listIterator.hasPrevious()){
           System.out.println(listIterator.previous());
       }






    }
}
