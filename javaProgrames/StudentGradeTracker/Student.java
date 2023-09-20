import java.util.LinkedList;
import java.util.List;

public class Student {
    String studentName;
    List<Course> coursesOfStudent;

    public Student(String studentName) {
        this.studentName = studentName;
        this.coursesOfStudent = new LinkedList<>();
    }


    public String getStudentName() {
        return studentName;
    }

    public List<Course> getCoursesOfStudent() {
        return coursesOfStudent;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCoursesOfStudent(List<Course> coursesOfStudent) {
        this.coursesOfStudent = coursesOfStudent;
    }

    public void addCourses(Course course){
        coursesOfStudent.add(course);
    }

    public double calculateCGPA(){
        double totalCredits = 0.0;
        double totalWeightedGPA = 0.0;

        for (Course course : coursesOfStudent) {
            totalCredits += course.getCreditHours();
            totalWeightedGPA += course.getGrade() * course.getCreditHours();
        }

        if (totalCredits == 0) return 0.0;

        return totalWeightedGPA / totalCredits;

    }

    @Override
    public String toString() {

        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", coursesOfStudent=" + coursesOfStudent +
                '}';
    }
}
