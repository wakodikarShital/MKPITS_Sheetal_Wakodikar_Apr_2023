package Overrriding;

public class Student extends Teacher {
    @Override
    public void teacher1() {
        System.out.println("she is talking to other");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.teacher1();
    }
}
