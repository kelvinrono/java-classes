public class Book {
    
    //attributes or properties
    private String title;
    private String author;
    private String isbn;
    private Boolean isBorrowed = false;

    // parameterized constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // empty constructor
    public Book() {
        
    }
    // getters and setters for each field
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Boolean getIsBorrowed() {
        return isBorrowed;
    }
    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }














    
}