public class Course {
        String courseName;
        int creditHours;
        double grade;

    public Course(String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public double getGrade() {
        return grade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

//    beaconhch.com


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", creditHours=" + creditHours +
                ", grade=" + grade +
                '}';
    }
}
