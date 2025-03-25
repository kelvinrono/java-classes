
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        
        // Setting attributes data using setters
        student1.setFirstName("Kelvin");
        student1.setLastName("Cheruiyot");

        // getting attributes data using getters
        String firstName = student1.getFirstName();
        String fullName = student1.fullName();

        System.out.println("First name "+firstName);
        System.out.println("Full name "+fullName);


  }

}

