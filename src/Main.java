import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        Course course = new Course(courseName, "Instructor");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter student major: ");
        String major = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter earned credits: ");
        int credits = scanner.nextInt();

        Student s1 = new Student(name, id, major);
        s1.updateGPA(gpa);
        s1.addCredits(credits);

        // дополнительные студенты (без инпута — это ОК)
        Student s2 = new Student("Bob Johnson", "S002", "Math");
        s2.updateGPA(3.2);
        s2.addCredits(25);

        Student s3 = new Student("Carol White", "S003", "Physics");
        s3.updateGPA(3.9);
        s3.addCredits(40);

        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s3);

        System.out.println("\nCourse average GPA: " + course.getAverageGPA());
        System.out.println("Highest credit student: " + course.getHighestCreditStudent());
        System.out.println("Top GPA student: " + course.getTopStudentByGPA());
        System.out.println("Number of honors students: " + course.countHonorsStudents());
        System.out.println("Total credits earned: " + course.getTotalCredits());

        scanner.close();
    }
}
