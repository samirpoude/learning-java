/*
3. Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price.
Implement a default constructor and two parameterized constructors:

 a. One constructor takes title and author as parameters.
  b. The other constructor takes title, author, and price as parameters.
   c. Print the values of the variables for each constructor.
 */

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println("book1 title: " + book1.getTitle());
        System.out.println("book1 author: " + book1.getAuthor());
        System.out.println("book1 price: " + "$" +  book1.getPrice());

        Book book2 = new Book(" thousand splendid sun ", " khaled housain ");
        System.out.println("book2 title: " + book2.getTitle());
        System.out.println("book2 author: " + book2.getAuthor());
        System.out.println("book2 price: " + "$"+ book2.getPrice());

        Book book3 = new Book(" how to not give a f*ck ", " mark manson ", 13.5);
        System.out.println("book3 title: " + book3.getTitle());
        System.out.println("book3 author: " + book3.getAuthor());
        System.out.println("book3 price: " + "$" + book3.getPrice());


    }
}
