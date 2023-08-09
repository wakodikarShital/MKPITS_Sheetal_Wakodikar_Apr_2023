public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Shital "); // It is  orignal string
        System.out.println(stringBuffer.append("Wakodikar"));  // now orignal string is change

        System.out.println(stringBuffer);   // Print also as it is become object because of value store in object

        System.out.println("---------------insert()---------------");
        stringBuffer.insert(1," Surname ");  // offset : when we insert  and int : value when we add
        System.out.println(stringBuffer);










    }
}