package oopConcepts.constructor;

public class Person {

    private String name;    //must
    private String surName; //must
    private int age;
    private String phoneNumber;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    

    public static void main(String[] args) {

        Person person1 = new Person("Sedat", "Osman");
        person1.age = 30;
        System.out.println("person1.age = " + person1.age);

    }
}
