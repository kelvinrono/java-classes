
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        // setting atrributes data
        student1.firstName = "Kelvin";
        student1.lastName = "Cheruiyot";
        student1.rollNo = 1;
        student1.section = "A";

        String fullName = student1.fullName();

        String firstName = student1.firstName;

        //Accessng attributes data
        System.out.println("first name "+ firstName);

        // System.out.println(fullName);

  }

}

