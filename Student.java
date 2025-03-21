// create a Student class
public class Student {
   // Declaring attributes
   String name;
   int rollNo;
   String email;

   // initialize attributes
   Student(String name, int rollNo, String section){
      this.name= name;
      this.rollNo = rollNo;
      this.section = section;
   }
   // print details	  
   public void printDetails() {
      System.out.println("Student Details:");
      System.out.println(this.name+ ", "+", " + this.rollNo + ", " + section);
   }
}
