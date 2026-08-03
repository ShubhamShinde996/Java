package Java_Core;

import java.util.ArrayList;

// 104 . Java Exercise 7 : Library management System in Java
// 113 . Solve
class Book{
    public String name , author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name= ' " +  name + '\'' +
                ", author='" + author + '\'' +
                '}';

    }
}
class MyLibrary{
    public ArrayList<Book> books;
     public MyLibrary (ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
         this.books.add(book);
    }
    public void issueBook(Book book , String issued_to){
        System.out.println("The book has been issued to the library " +  issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned to the library");
        this.books.add(b);
    }

}
public class Shubham84 {
    public static void main(String[] args) {
        /*
        Creating a library management system which is capable of issuing books to the students .
        Book Should have info like :
        1.Book Name
        2.Book Author
        3.Issued to
        4.Issued On
        User Should be able to add books , return issued books,issue books
        Assume that all the users are registred with their names in the central database
        */

        // Exercise 7
        ArrayList<Book> bk = new ArrayList<Book>();
        Book b1=new Book( "Algorithm" , "CLRS");
        bk.add(b1);

        Book b2 = new Book( "Software Engineer" , "Engineer ram");
        bk.add(b2);

        Book b3 = new Book( "Software Developer" , "Engineer Ali ");
        bk.add(b3);

        Book b4 = new Book( "Civil Engineer" , "Engineer sham");
        bk.add(b4);

        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new Book("Java Programming" , "Programmer Radhe"));
        System.out.println(ml.books);
        ml.issueBook(b3,"Harry");
        System.out.println(ml.books);



    }
}
