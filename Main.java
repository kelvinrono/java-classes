import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try {
            // creating a file

            File myfile = new File("example.txt");

            if(myfile.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exist");
            }

            // Write to a file

            // FileWriter fileWriter = new FileWriter("example.txt");
            // fileWriter.write("Java is an awesome language but sometimes complicated");
            // fileWriter.close();

            // Reading a file

            // File file = new File("example.txt");
            // Scanner myReader = new Scanner(file);

            // while (myReader.hasNextLine()) {
            //     String data = myReader.nextLine();
            //     System.out.println(data);
            // }
            // myReader.close();

            // File file = new File("example.txt");
            // if(file.delete()){
            //     System.out.println("File has been deleted successfully");
            // }else{
            //     System.out.println("File failed to delete");
            // }

            // File Information
            // if (myfile.exists()) {
            //     System.out.println("File name: " + myfile.getName());
            //     System.out.println("Absolute path: " + myfile.getAbsolutePath());
            //     System.out.println("Writeable: " + myfile.canWrite());
            //     System.out.println("Readable " + myfile.canRead());
            //     System.out.println("File size in bytes " + myfile.length());
                
            //   } else {
            //     System.out.println("The file does not exist.");
            //   }
          

        } catch (Exception e) {
           System.out.println("An error occurred");
           e.printStackTrace();
        }
    }
}