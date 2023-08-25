import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(22);
        linkedList.add(32);
        linkedList.add(19);
        linkedList.add(35);
        System.out.println("----------Print values using whole object------------");
        System.out.println(linkedList);

        System.out.println("----------Print values using for loop------------");
        for (int number=0;number<linkedList.size();number++){
            System.out.println(linkedList.get(number));
        }
        System.out.println("----------Print values using iterator------------");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------Method using addFirst(E e)------------");
        linkedList.addFirst(22);
        System.out.println(linkedList);

        System.out.println("----------Method using addLast(E e)------------");
        linkedList.addLast(33);
        System.out.println(linkedList);

        System.out.println("----------Method using get(int index)------------");
        System.out.println("index of 3 is value = "+linkedList.get(3));

        System.out.println("----------Method using indexOf(object o)------------");
        System.out.println(linkedList.indexOf(32));

        System.out.println("----------Method using lastIndexOf(object o)------------");
        System.out.println(linkedList.lastIndexOf(22));

        System.out.println("----------Method using listIterator(int index)------------");
        Iterator iterator1=linkedList.listIterator(1);
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("----------Method using offer(E e)------------");
        System.out.println(linkedList.offer(50));

        System.out.println("----------Method using offerFirst(E e)------------");
        System.out.println(linkedList.offerFirst(29));

        System.out.println("----------Method using peek()------------");
        System.out.println(linkedList.peek());

        System.out.println("----------Method using peekFirst()------------");
        System.out.println(linkedList.peekFirst());

        System.out.println("----------Method using poll()------------");
        System.out.println(linkedList.poll());

        System.out.println("----------Method using pop()------------");
        System.out.println(linkedList.pop());

        System.out.println("----------Method using push()------------");
        linkedList.push(7);
        System.out.println(linkedList);

        System.out.println("----------Method using spliterator()------------");
        linkedList.spliterator();
        System.out.println(linkedList);




    }
}
