
public class Main {

    public static void main(String[] args) {

      Bank kelvinAccount = new Bank("Kelvin Cheruiyot", 123456, 1000.0); // creating an object of Bank class

      int accountNumber = kelvinAccount.getAccountNumber(); // getting account number using getter method and storing it in new varibale

      System.out.println("Account Balance " + kelvinAccount.getBalance()); // getting balance using getter method

      kelvinAccount.withdraw(10000.0); // Attempting to withdraw more than balance

      kelvinAccount.withdraw(-10.0); // Attempting to withdraw negative amount

  }

}

