public class Main{
    public static void main(String[] args){
        double doubleNum = 9.99;

        int newInt = (int) doubleNum;
        System.out.println("Our number "+ newInt);

        //Casting to a string
        String myString = String.valueOf(doubleNum);
        System.out.println("Our number "+ myString);

    }
}