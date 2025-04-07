import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        int choice = 0;

        do{
            //Menu Options
            System.out.println("Library Menu");
            System.out.println("Enter 1 to add a books");
            System.out.println("Enter 2 to Display all available books");
            System.out.println("Enter 3 to Borrow a book");
            System.out.println("Enter 4 to return a book");
            System.out.println("Enter 5 to exit");

            System.out.println("Choose an option");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the title");
                    String title = scanner.nextLine();

                    System.out.println("Enter the author");
                    String author = scanner.nextLine();

                    System.out.println("Enter the isbn");
                    String isbn = scanner.nextLine();

                    library.addBook(title, author, isbn);

                    break;

                    case 2:
                    library.displayBooks();
                
                    break;

                    case 3:
                    System.out.println("Enter ISBN of the book");
                    String borrowedBookIsbn = scanner.nextLine();
                    library.borrowBook(borrowedBookIsbn);
                    break;

                    case 4:
                    System.out.println("Enter ISBN of a book to return");
                    String bookReturnedIsbn = scanner.nextLine();
                    library.returnBook(bookReturnedIsbn);
                    break;

                    case 5: 
                    System.out.println("Exiting the program");
            
                default:
                System.out.println("You have entered an invalid option. Please try again!");
                    
            }

        }
        while(choice!=5);

        scanner.close();

    }

}