package oopConcepts.oopPrinciples.polimorphism.sample2;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.name = "Teacher Tamara";
        teacher1.age = 34;
        teacher1.phoneNumber = "98129734";


        Student student1 = new Student();
        student1.name = "Student Sedat";
        student1.age = 22;
        student1.phoneNumber = "0987698";

        student1.teacher = teacher1;

                printInfo(student1);
        printInfo(teacher1);

        // 1st, better way. Method overloading
        // to print the info of the object, we can have 2 different methods
        // we can do overloading

        //2nd best way. get use a from polymorphism
        System.out.println("==================");
        printInfoUser(student1);    // student and teacher "is A" User principal
        printInfoUser(teacher1);

    }



    public static void printInfo (Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Phone Number: " + student.phoneNumber);
    }

    public static void printInfo (Teacher teacher) {
        System.out.println("Name: " + teacher.name);
        System.out.println("Age: " + teacher.age);
        System.out.println("Phone Number: " + teacher.phoneNumber);
    }

    //method
    public static void printInfoUser (User user) {
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("Phone Number: " + user.phoneNumber);
    }
}
