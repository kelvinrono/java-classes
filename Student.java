// create a Student class
public class Student {
   // Declaring attributes
   private String firstName;
   private String lastName;
   // initialize attributes
   Student(String firstName, String lastName){
      this.firstName= firstName;
      this.lastName = lastName;
   }

   //empty constructor
   Student(){
   }

   // Getters
   public String getFirstName(){
      return this.firstName;
   }

   public void setFirstName(String firstName){
      this.firstName = firstName;
   }

   public String getLastName(){
      return this.lastName;
   }
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }

   public String fullName() {
      return this.firstName + " " + this.lastName;
   }
}
