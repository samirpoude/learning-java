
// Chaining Constructors
//Write a Java program to create a class called Student with instance variables studentId,
// studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables.
// Use constructor chaining to initialize the variables. Print the values of the variables.

public class Main {
    public static void main(String[] args) {

        // creating a new object;

        Student student1 = new Student();
        System.out.println("student1 ID : " + student1.getStudentId());
        System.out.println("student1 Name : " + student1.getStudentName());
        System.out.println("student1 grade : " + student1.getGrade());

        Student student2 = new Student(1, "Samir poudel", "A");
        System.out.println("student1 ID : " + student2.getStudentId());
        System.out.println("student1 Name : " + student2.getStudentName());
        System.out.println("student1 grade : " + student2.getGrade());


    }
}
