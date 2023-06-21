package Overrriding;

public class Studentbook extends Book {
    public void typeOfBook(){
        System.out.println("This is a comik book");
    }

    public static void main(String[] args) {
        Studentbook studentbook = new Studentbook();
        studentbook.typeOfBook();
    }
}
