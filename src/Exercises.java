import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Exercises {

    Scanner scanner = new Scanner(System.in);

    public void ExOne() {
        System.out.print("Type your name: ");
        String userName = scanner.next();
        System.out.printf("Hello and welcome, " + userName);
    }

    public void ExTwo() {
        System.out.print("Type an number: ");
        double userNumber = scanner.nextDouble();

        if (userNumber > 0) {
            System.out.println("This number is positive.");
        } else if (userNumber < 0) {
            System.out.println("This number is negative.");
        } else {
            System.out.println("This number is neutral.");
        }
    }

    public void ExThree() {

        double avarege = 0;
        System.out.println("Lets check the avarege of 3 number");
        for (int i = 0; i < 3; i++) {
            System.out.print("Type a number: ");
            avarege += scanner.nextInt();
        }
        System.out.println("The avarege is = " + avarege / 3);
    }

    public void ExFour() {
        System.out.println("Lets check if you can go to the jale \n Type your age: ");
        double userAge =  scanner.nextInt();

        if (userAge >= 18) {
            System.out.println("Yes, you can");
        }
        else {
            System.out.println("No, you can not");
        }
    }

    public void ExFive() {
    }

    public void ExSix() {
    }
    public void ExSeven() {
    }
    public void ExEight() {
    }
    public void ExNine() {
    }
    public void ExTen() {
    }
}