import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList();
      list.add(45);
      list.add(22);
      list.add(25);
      list.add(30);
      List list1 = new ArrayList();
      list1.add("shital");
      list1.add("wakodikar");
        System.out.println("Print using an object");
        System.out.println(list);
        System.out.println("print using for loop");
        for (int element=0;element<list.size();element++){
            System.out.println(list.get(element));
        }
        System.out.println("Print using for each loop");
        for (Integer element:list) {
            System.out.println(element);
        }
        System.out.println("print using Iterator");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("print using method of add(int index ,E element)");
        list.add(0,20);
        System.out.println(list);

        System.out.println("Print using method of add(E e)");
        list.add(40);
        System.out.println(list);

        System.out.println("----------------+Print using method of addAll(int index, Collection<? extends E> c)----------------");
        list.addAll(0,list1);
        System.out.println(list);

      System.out.println("----------------Print using method of addAll(Collection<? extends E> c)----------------");
      list.addAll(list1);
      System.out.println(list);

      System.out.println("----------------Print using method of contains(object o )----------------");
      System.out.println(list.contains(40));

      System.out.println("----------------Print using method of set(int a,element) )----------------");
      list.set(0,35);
      System.out.println(list);


    }
}