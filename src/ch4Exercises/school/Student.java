package ch4Exercises.school;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("Jerry", 1, 1, 4.0);

        System.out.println(myself.getName());

        System.out.println(myself.getStudentId());

        System.out.println(myself.studentInfo());
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    /* getters and setters ADDED! */

    public String getName () {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    };

    private void setStudentId() {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits() {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa() {
        this.gpa = gpa;
    }


}
