import java.util.Scanner;


public class LoginSystem {
    public static void main(String[] args) {
        attemptLogin(); // Call the function to handle login attempts
    }


    public static void attemptLogin() {
        Scanner scanner = new Scanner(System.in);


        // Correct login credentials
        String correctUsername = "admin";
        String correctPassword = "
        ";


        int attempts = 0; // Track number of failed attempts
        final int MAX_ATTEMPTS = 3; // Maximum allowed attempts


        while (attempts < MAX_ATTEMPTS) {
            // Asking user for input
            System.out.print("Enter username: ");
            String username = scanner.nextLine();


            System.out.print("Enter password: ");
            String password = scanner.nextLine();


            // Checking credentials (==)
            if (username.equals(correctUsername) &&   password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome.");
                scanner.close(); // Close scanner before exiting
                return; // Exit the function on successful login
            } else {
                attempts++; // Increase attempt count
                int remainingAttempts = MAX_ATTEMPTS - attempts;


                if (remainingAttempts > 0) {
                    System.out.println("Invalid username or password. Attempts left: " + remainingAttempts);
                } else {
                    System.out.println("Account locked! Too many failed attempts.");
                }
            }
        }


        	scanner.close(); // Close scanner after all attempts
    }
}
