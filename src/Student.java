public class Student {

    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public void updateGPA(double gpa) {
        this.gpa = gpa;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public boolean isHonorsStudent() {
        return gpa >= 3.5;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id='" + id +
                "', major='" + major + "', gpa=" + gpa +
                ", credits=" + credits + "}";
    }
}
