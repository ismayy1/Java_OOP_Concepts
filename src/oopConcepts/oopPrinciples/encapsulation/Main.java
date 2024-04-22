package oopConcepts.oopPrinciples.encapsulation;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mikail", "Ozkan", "12345");
        System.out.println("user1 = " + user1);

        user1.password = "337872";


        //instance from encapsulated user
        EncapsulatedUser encapsulatedUser = new EncapsulatedUser("Sedat", "Osman", "12345");
        System.out.println(encapsulatedUser.getName());

    }
}
