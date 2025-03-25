// create a Student class
public class Student {
   // Declaring attributes
   String firstName;
   String lastName;
   int rollNo;
   String email;
   String section;

   // initialize attributes
   Student(String firstName, String lastName, int rollNo, String section){
      this.firstName= firstName;
      this.rollNo = rollNo;
      this.section = section;
      this.lastName = lastName;
   }

   //empty constructor
   Student(){
   }
   
   // print details	  
   public void printDetails() {
      System.out.println("Student Details:");
      System.out.println(this.firstName+ ", "+", " + this.rollNo + ", " + this.section);
   }
   public String fullName() {
      return this.firstName + " " + this.lastName;
   }
}
