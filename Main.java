
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.firstName = "Kelvin";
        student1.lastName = "Cheruiyot";
        student1.rollNo = 1;
        student1.section = "A";

        String fullName = student1.fullName();

        System.out.println(fullName);

  }

}

