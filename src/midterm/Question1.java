package src.midterm;

public class Question1 {
    public static void main(String[] args) {
        Student student1 = new Student("student1",001,4.0);
        //shallow copy (same address)
        Student student2 = student1;
        System.out.println(student2.getName());//name:student1
        //change student1's information, student2 will also change
        student1.setName("student100");
        System.out.println(student2.getName());//student2's name is "student100"

        //deep copy(different address)
        Student student3 = new Student(student1);
        //change student1's information, student3 will not change
        student1.setName("007");
        System.out.println(student3.getName());//student3's name will not change(studeng100)

    }
}
class Student{
    String name;
    int studentID;
    double gpa;

    public Student() {
    }

    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //deep copy constructor
    public Student(Student student){
        this.name = student.name;
        this.studentID = student.studentID;
        this.gpa = student.gpa;
    }
}
