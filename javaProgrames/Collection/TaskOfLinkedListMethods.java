import java.util.Iterator;
import java.util.LinkedList;

public class TaskOfLinkedListMethods {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(20);
        linkedList.add(19);
        linkedList.add(22);
        linkedList.add(25);

        LinkedList linkedList1 = new LinkedList();
        linkedList.add("shital");
        linkedList.add("wakodikar");
        linkedList.add(22);
        linkedList.add(25);


        System.out.println("----1.-append the specified element to the end of a linked list.----");
        linkedList.addLast(36);
        System.out.println("Using method addLast(E e) = " +linkedList);


        System.out.println("----2.-iterate through all elements in a linked list.----");
        System.out.println("using iterator also using while loop ");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        linkedList.listIterator();
        System.out.println("list of values in the linkedList using method listIterator() = "+linkedList);

        System.out.println("----3.-iterate through all elements in a linked list starting at the specified position.----");
        System.out.println("Using iterator");
        Iterator iterator1 = linkedList.listIterator(1);
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("Using for loop");
        for (int number=2;number<linkedList.size();number++){
            System.out.println(linkedList.get(number));
        }

        System.out.println("----4.-iterate a linked list in reverse order.----");
        Iterator iterator2=linkedList.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("----5.-insert the specified element at the specified position in the linked list.----");
        linkedList.add(1,50);
        System.out.println(linkedList);

        System.out.println("----6.-insert elements into the linked list at the first and last positions.----");
        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println(linkedList);

        System.out.println("----7.-insert the specified element at the front of a linked list.----");
        linkedList.push(22);
        System.out.println("Insert front of the element using method push() = " +linkedList);

        System.out.println("----8.-insert the specified element at the end of a linked list.----");
        linkedList.offerLast(60);
        System.out.println(linkedList);

        System.out.println("----9.-insert some elements at the specified position into a linked list.----");
        linkedList.add(2,15);
        linkedList.add(3,15);
        System.out.println(linkedList);

        System.out.println("----10.-get the first and last occurrence of the specified elements in a linked list.----");
        System.out.println(linkedList.indexOf(15));
        System.out.println(linkedList.lastIndexOf(15));

        System.out.println("----11.-display elements and their positions in a linked list.----");
        System.out.println();

        System.out.println("----12.-remove a specified element from a linked list.----");
        System.out.println(linkedList.remove(4));

        System.out.println("----13.-remove the first and last elements from a linked list.----");
        System.out.println("first element remove = "+linkedList.removeFirst());
        System.out.println("last element remove = "+linkedList.removeLast());

        System.out.println("----14.-remove all elements from a linked list.----");
        linkedList.clear();
        System.out.println(linkedList);

        System.out.println("----15.Write a Java program that swaps two elements in a linked list.----");
        System.out.println();

        System.out.println("----16.-shuffle elements in a linked list.----");
        System.out.println();

        System.out.println("----17.-join two linked lists.----");
        System.out.println(linkedList.add(linkedList1));
        System.out.println(linkedList);

        System.out.println("----18.-copy a linked list to another linked list.-----");
        System.out.println();

        System.out.println("----19.-remove and return the first element of a linked list.------");

        System.out.println("----20.-retrieve, but not remove, the first element of a linked list.----");
        System.out.println(linkedList.peekFirst());

        System.out.println("----21.-retrieve, but not remove, the last element of a linked list.----");
        System.out.println("----22-check if a particular element exists in a linked list.-----");
        System.out.println("----23.-convert a linked list to an array list.----");
        System.out.println("----24.-compare two linked lists.-----");
        System.out.println("----25.-check if a linked list is empty or not.-----");
        System.out.println("----26.-replace an element in a linked list.----");

    }
}
