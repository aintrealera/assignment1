public class Course {

    private String courseName;
    private String instructor;
    private Student[] students;
    private int count;

    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[10];
        this.count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        }
    }

    public double getAverageGPA() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].getGpa();
        }
        return count == 0 ? 0 : sum / count;
    }

    public Student getHighestCreditStudent() {
        Student max = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].getCredits() > max.getCredits()) {
                max = students[i];
            }
        }
        return max;
    }

    public Student getTopStudentByGPA() {
        Student top = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].getGpa() > top.getGpa()) {
                top = students[i];
            }
        }
        return top;
    }

    public int countHonorsStudents() {
        int honors = 0;
        for (int i = 0; i < count; i++) {
            if (students[i].isHonorsStudent()) {
                honors++;
            }
        }
        return honors;
    }

    public int getTotalCredits() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += students[i].getCredits();
        }
        return total;
    }
}
