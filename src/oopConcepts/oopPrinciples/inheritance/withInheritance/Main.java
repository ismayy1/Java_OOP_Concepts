package oopConcepts.oopPrinciples.inheritance.withInheritance;

public class Main {
    public static void main(String[] args) {

        //instance from student class
        Student student = new Student();
        student.name = "Tamara";
        student.surname = "Kalesh";

        student.displayLessons();

        //instance from teacher
        Teacher teacher = new Teacher();
        teacher.name = "Ismail";
        teacher.surname = "Atagarryyev";
        teacher.field = "Comp. Science";

        teacher.displayLessons();
        teacher.displayLessons(5);

    }
}
