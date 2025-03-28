
//An example to show a class can be called in several classes
public class Main2{

    Bank amaniAccount = new Bank("Amani", 234567, 10000.0);
      
    System.out.println("Account Balance " + amaniAccount.getBalance());

    amaniAccount.withdraw(10000.0);

    amaniAccount.withdraw(-10.0);

}