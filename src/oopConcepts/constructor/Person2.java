package oopConcepts.constructor;

import lombok.Builder;

@Builder

public class Person2 {
    private String name;    //must
    private String surName; //must
    private int age;
    private String phoneNumber;



    public static void main(String[] args) {

        Person2 person1 = Person2.builder()
                .name("Me")
                .build();

        System.out.println("person1 = " + person1.name);

        Person2 person2 = Person2.builder()
                .name("Tamara")
                .surName("Kalesh")
                .build();

        System.out.println("person2.surName = " + person2.surName);

    }
}
