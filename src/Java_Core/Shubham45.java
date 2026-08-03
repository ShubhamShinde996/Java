package Java_Core;
// 61 . Answer vdio solutions

class library{
    String [] books;
    int no_of_books = 0;
    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[this.no_of_books] = book;
        this.no_of_books++;
        System.out.println(book + " has been added to the library");
    }
    void ShowAvailableBooks(){
        System.out.println("Available Books are : ");
        for(String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for(int i = 0; i<this.books.length; i++){
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
            System.out.println("This book does not exist!");
        }
        void retuernBook(String book){
            addBook(book);
        }
    }


public class Shubham45 {
    public static void main(String args[]) {
        // You have implement a library using Java class Library
        // Methods ; - issueBook , returnBook
        // Properties : Array to store the available books,
        // Array to store the issued books

        library lab = new library();
        lab.addBook("Think and grow Rich");
        lab.addBook("Algirithms");
        lab.addBook("Harry Potter");
        lab.addBook("C++");
        lab.addBook("The Godfather");
        lab.addBook("The Lord of the Rings");
        lab.ShowAvailableBooks();
        lab.issueBook("The Lord of the Rings");
        lab.retuernBook("The Lord of the Rings");
        lab.ShowAvailableBooks();


    }
}
