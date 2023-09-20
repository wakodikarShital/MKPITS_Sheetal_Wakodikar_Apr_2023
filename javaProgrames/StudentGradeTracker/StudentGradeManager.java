import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
//       List<Course> courseList = new LinkedList<>();
//       courseList.add(new Course("English",5,6.8));
//        courseList.add(new Course("Atomobile",8,7.8));
//        courseList.add(new Course("Electronics & Telecommunication",7,6.8));
//        System.out.println(courseList);
//
//
//        Student student = new Student("Shital",courseList);
//        System.out.println(student);



            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            Student student = new Student(studentName);

            System.out.print("Enter the number of courses: ");
            int numCourses = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numCourses; i++) {
                System.out.print("Enter course name for course " + (i + 1) + ": ");
                String courseName = scanner.nextLine();

                System.out.print("Enter credits for course " + (i + 1) + ": ");
                int credits = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter grade (0.0 - 4.0) for course " + (i + 1) + ": ");
                double grade = scanner.nextDouble();
                scanner.nextLine();

                Course course = new Course(courseName,credits);
                course.setGrade(grade);

                student.addCourses(course);
            }

            // Calculate GPA
            double gpa = student.calculateCGPA();
            System.out.println("Student GPA: " + gpa);
        }
    }













