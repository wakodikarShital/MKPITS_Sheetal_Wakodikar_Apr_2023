public class Student {
    String name;
    int marks;

    //getter


    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }


    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }



    public String toString(){
        return " Student name = " + name+ " Student marks = " + marks;
    }


}
