package oopConcepts.oopPrinciples.encapsulation;

public class EncapsulatedUser {
    private String name;
    private String surname;
    private String password;

    public EncapsulatedUser(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPassword() {
        return password;
    }
}
