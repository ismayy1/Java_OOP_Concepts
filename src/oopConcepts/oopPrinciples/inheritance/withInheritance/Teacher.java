package oopConcepts.oopPrinciples.inheritance.withInheritance;

public class Teacher extends User {

    public String field;


    // method overriding
    @Override
    public void displayLessons() {
        System.out.println("Lessons that teacher teaches .... ");
        System.out.println("Teacher name: " + name + " " + surname);
        System.out.println("Teacher field: " + field);
    }

    //method overloading
    public void displayLessons(int nrLessons) {
        System.out.println("Lessons that teacher teaches .... ");
        System.out.println("Number of lessons: " + nrLessons);
    }

}
