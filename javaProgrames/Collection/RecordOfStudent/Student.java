package RecordOfStudent;

public class Student {

        public String name;
        public int marks;

        public Student(){

        }

        public Student(String name, int marks){
            this.name=name;
            this.marks=marks;

        }

        //getter


        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

    @Override
    public String toString() {
        return "Student Name = "+name +" Student Marks "+marks;
    }
}



