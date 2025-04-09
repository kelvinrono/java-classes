import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Lion lion =  new Lion();

        dog.eat();
        dog.sleep();
        dog.sound();
        System.out.println("\n");

        lion.eat();
        lion.sleep();
        lion.sound();
        System.out.println("\n");

    }

}