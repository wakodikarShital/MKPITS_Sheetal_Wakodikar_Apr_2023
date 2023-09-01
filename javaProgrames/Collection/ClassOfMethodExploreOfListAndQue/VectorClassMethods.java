package ClassOfMethodExploreOfListAndQue;

import java.util.Iterator;
import java.util.Vector;

public class VectorClassMethods {
    public static void main(String[] args) {

        Vector vector1= new Vector();
        vector1.add("shital");
        vector1.add("Mrunali");
        vector1.add(99);
        System.out.println("-----Print object as whole value----- "+vector1);


        Vector vector = new Vector<>(5);
        vector.add(32);
        vector.add(12);
        vector.add(10);
        vector.add(9);
        vector.add(15);
        System.out.println("-----Print object as whole value-----");
        System.out.println(vector);

        System.out.println("-----Print object by for loop-----");
        for (int number=0;number<vector.size();number++){
            System.out.println(vector.get(number));
        }

        System.out.println("-----Print object by forEach loop-----"); // when we used at the time of same data types we use
        for (Object number:vector) {
            System.out.println(number);
        }

        System.out.println("-----Print object Using iterator-----");
        Iterator iterator=vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------Method using add(E e) return boolean value-----------");
        vector.add(100);
        System.out.println("Add the object in last position = "+vector);

        System.out.println("---------Method using add(int index,E element)-----------");
        vector.add(0,32);
        System.out.println("Object add in specified index which one is giving = "+vector);

        System.out.println("---------Method using addAll(int index, Collection<? extends E> c)-----------");
        System.out.println("add vectorlist on the position which we given = "+vector.addAll(0,vector1));
        System.out.println(vector);

        System.out.println("-------Method using addElement(E obj)-----------");
        System.out.println("--Adds the specified component to the end of this vector, increasing its size by one.--");
        vector.addElement(32);
        System.out.println(vector);

        System.out.println("-------Method using capacity()-----------");
        System.out.println("current capacity of this vector = "+vector.capacity());

        System.out.println("------Method using clone()----------");
        System.out.println("Returns a clone of this vector = "+vector.clone());

        System.out.println("------Method using contains(Object o)----------");
        System.out.println("Returns true if the object is available = "+vector.contains(32));

        System.out.println("------Method using containsAll(Collection<?> c)---------");
        System.out.println(vector.containsAll(vector1));

        System.out.println("------Method using copyInto(Object[] anArray)---------");

        System.out.println("------Method using elements()---------");
        vector.elements();
        System.out.println(vector);

        System.out.println("------Method using ensureCapacity(int minCapacity)---------");
        vector1.ensureCapacity(6);
        System.out.println(vector1);

        System.out.println("------Method using equals(Object o)---------");
        System.out.println(vector.equals(32));

        System.out.println("------Method using forEach(Consumer<? super E> action)---------");

        System.out.println("------Method using hashCode()---------");
        System.out.println(vector.hashCode());

        System.out.println("------Method using indexOf(Object o,int index)---------");
        System.out.println(vector.indexOf(32,4));

        System.out.println("------Method using insertElementAt(E obj, int index) ---------");
        vector.insertElementAt(45,5);
        System.out.println(vector);

        System.out.println("------Method using isEmpty()  ---------");
        System.out.println(vector.isEmpty());

        System.out.println("------Method using lastIndexOf(Object o)---------");
        System.out.println(vector.lastIndexOf(32));

        System.out.println("------Method using lastIndexOf(Object o ,int index)---------");
        System.out.println(vector.lastIndexOf(32,3));

        System.out.println("------Method using removeIf(Predicate<? super E> filter)---------");
//        System.out.println(vector.removeIf(vect));

        System.out.println("------Method using replaceAll(UnaryOperator<E> operator)---------");








    }

}
