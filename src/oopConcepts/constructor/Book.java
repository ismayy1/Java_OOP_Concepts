package oopConcepts.constructor;

public class Book {

    public String name;
    public String author;
    public int pageNumber;
    public String publisher;
    public double price;

    // we can decide how to create an instance/object from this class

    // default constructor
    public Book () {}

    public Book(String name, String author, int pageNumber, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publisher = publisher;
        this.price = price;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    /*
            Notes on constructor:
            -purpose - to create instance / object
            -Constructors are special type of functions with the same name as class and no return data type
            -name should start with uppercase
            -no return type
            -can be overloaded
     */

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.name = "Kite Runner";
        book1.author = "Haleed";
        book1.pageNumber = 250;
        book1.price = 30;

        Book book2 = new Book("Abc", "JK Rowling",
                260, "Zaef", 224);

        Book book3 = new Book("Harry Poter", "JK Rowling");

    }

}
