import java.util.ArrayList;
import java.util.List;

public class Library{

    // declare a collection of books(empty)
    public List<Book> books = new ArrayList<Book>();

    // A method to add a book
    public void addBook(String title, String author, String isbn){
        books.add(new Book(title, author,isbn));
    }

    //Display all the books

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books available");
            return;
        }
        System.out.println("Available books");
        
        for(Book book: books){
            System.out.println("book title: "+book.getTitle()
             + " book author"+ book.getAuthor() + 
             " book isbn " + book.getIsbn() +" is book borrowed"+ book.getIsBorrowed());
        }

    }

    // Borrow a books
    public void borrowBook(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn) && !book.getIsBorrowed()){
                book.setIsBorrowed(true);
                System.out.println("You have successfully borrowed "+book.getTitle());
                return;
            }
        }
        System.out.println("Invalid ISBN or the book is not available");

    }

    //Return a book
    public void returnBook(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn) && book.getIsBorrowed()){
                book.setIsBorrowed(true);
                System.out.println("You have returned" + book.getTitle());
                return;
            }
        }
        System.out.println("Invalid ISBN or the books was not borrowed");

    }




}