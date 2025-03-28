public class Bank{

    private String fullName; // 
    private Integer accountNumber; //int and Integer are the same
    private Double balance; // double stores the same value as Double

// Parameterized constructor to initialize the variables in this class.
    public Bank(String fullName, Integer accountNumber, Double balance){
       this.fullName = fullName;
       this.accountNumber = accountNumber;
       this.balance = balance; 
    }

    //getter for fullName
    public String getFullName(){
        return this.fullName;
    }

    //setter for fullName
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    // getter for accountNumber
    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    //setter for accountNumber
    public void setAccountNumber(Integer accountNumber){
        this.accountNumber = accountNumber;
    }

    //getter for balance
    public Double getBalance(){
        return this.balance;
    }

    //setter for balance
    public void setBalance(Double balance){
        this.balance = balance;
    }

    // Default constructor/ empty constructor
    public Bank(){
    }

    // class method to deposit
    public void deposit(Double amount){
        this.balance += amount; // taking current balance and adding the amount then set it as new balance
                                //same as this.balance = this.balance + amount

        System.out.println("You have successfully deposited " + amount + ". Your new balance is " + this.balance);
    }

    public void withdraw(Double amount){
        if(amount>0 && amount<this.balance){ // checking if the amount is greater than 0 and less than balance
            this.balance -= amount; // taking current balance and subtracting the amount then set it as new balance
                                    //same as this.balance = this.balance - amount
            System.out.println("You have successfully withdrawn " + amount + ". Your new balance is " + this.balance);
        }
        else if(amount > balance){ // checking if the amount is greater than balance
            System.out.println("Insufficient Balance");
        }
        else{ //
            System.out.println("Invalid amount");
        }
    }

    // class method to display bank details for full name, account number and balance
    public void bankDetails(){
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }




}