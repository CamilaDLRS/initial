import java.util.Scanner;
import java.util.Random;
public class Exercises {

    private final Scanner scanner = new Scanner(System.in);

    public void ExOne() {
        System.out.print("Type your name: ");
        String userName = this.scanner.next();
        System.out.printf("Hello and welcome, " + userName);
    }

    public void ExTwo() {
        System.out.print("Type a number: ");
        double userNumber = this.scanner.nextDouble();

        if (userNumber > 0) {
            System.out.println("This number is positive.");
        }
        else if (userNumber < 0) {
            System.out.println("This number is negative.");
        }
        else {
            System.out.println("This number is neutral.");
        }
    }

    public void ExThree() {
        double avarege = 0;
        System.out.println("Let's check the average of 3 integer numbers");

        for (int i = 0; i < 3; i++) {
            System.out.print("Type a number: ");
            avarege += this.scanner.nextInt();
        }

        System.out.println("The average is = " + avarege / 3);
    }

    public void ExFour() {
        System.out.println("Let's check if you can go to the jale \nType your age: ");
        double userAge =  this.scanner.nextInt();

        if (userAge >= 18) {
            System.out.println("Yes, you can");
        }
        else {
            System.out.println("No, you cannot");
        }
    }

    public void ExFive() {
        System.out.println("Let's convert Celsius to Fahrenheit");
        System.out.print("Type the temperature in C°: ");
        double tempCelsius = scanner.nextDouble();
        double tempFahrenheit = tempCelsius * 1.8 + 32;
        System.out.println(tempFahrenheit + " F°");
    }

    public void ExSix() {
        System.out.println("Rolling a 6-sided die...");
        Random random = new Random();
        int diceResult = random.nextInt(6);
        System.out.println("Result: " + (diceResult + 1));
    }

    public void ExSeven() {
        Random random = new Random();
        int randomResult = random.nextInt(4) + 1;

        System.out.print("Choose [1]Rock [2]Paper [3]Scissors: ");
        int userChoise = scanner.nextInt();

        if (randomResult == 1) {
            System.out.println("System choose: Rock");
            if (userChoise == 2) {
                System.out.println("You won.");
            }
            else if (userChoise == 3) {
                System.out.println("You lost.");
            }
            else if (userChoise == 1) {
                System.out.println("It is a tie.");
            }
        }
        else if (randomResult == 2) {
            System.out.println("System choose: Paper");
            if (userChoise == 3) {
                System.out.println("You won.");
            }
            else if (userChoise == 1) {
                System.out.println("You lost.");
            }
            else {
                System.out.println("It is a tie.");
            }
        }
        else {
            System.out.println("System choose: Scissors");
            if (userChoise == 1) {
                System.out.println("You won.");
            }
            else if (userChoise == 2) {
                System.out.println("You lost.");
            }
            else {
                System.out.println("It is a tie.");
            }
        }
    }

    public void ExEight() {
        System.out.print("Enter a number to see your factorial: ");
        int number = scanner.nextInt();
        int factorial = number;
        String textFactorial = String.valueOf(number);

        for (int i = 1; i < number; i++) {
            int previous = number - i;
            factorial *= previous;
            textFactorial += " * " + previous;
        }
        System.out.println(textFactorial + " = " + factorial);
    }

    public void ExNine() {
        System.out.println("Let's check if a number is Prime: ");
        int number = this.scanner.nextInt();
        boolean prime = true;

        if (number < 2) {
            prime = false;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(number + " it's prime");
        }
        else {
            System.out.println(number + " it's not prime");
        }
    }

    public void ExTen() {
        for (int i = 0; i < 100; i++) {

            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            }
            if ((i % 3) == 0) {
                System.out.println("Fizz");
            }
            if ((i % 5) == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}