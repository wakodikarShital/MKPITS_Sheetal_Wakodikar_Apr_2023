package ClassOfMethodExploreOfListAndQue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMethods  {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(4);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(6);

        System.out.println("--------------------Whole object---------------");
        System.out.println(copyOnWriteArrayList);

        System.out.println("--------------------print using method add()---------------");
        System.out.println(copyOnWriteArrayList.add(5));
        System.out.println(copyOnWriteArrayList);

        System.out.println("--------------------print using method addAllAbsent(Collection<? extends E> c)---------------");
        System.out.println(copyOnWriteArrayList.addAllAbsent(copyOnWriteArrayList));

        System.out.println(copyOnWriteArrayList);
        Collections.sort(copyOnWriteArrayList);
        System.out.println(copyOnWriteArrayList);

    }
}
