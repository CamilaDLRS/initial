import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Exercises exercises = new Exercises();

        System.out.println("Lets check some exercises, choose between 1 to 10. (Type 0 to stop the program.)");
        int exNumber = scanner.nextInt();

        do {
            switch (exNumber) {
                case 1:
                    exercises.ExOne();
                    break;
                case 2:
                    exercises.ExTwo();
                    break;
                case 3:
                    exercises.ExThree();
                    break;
                case 4:
                    exercises.ExFour();
                    break;
                case 5:
                    exercises.ExFive();
                    break;
                case 6:
                    exercises.ExSix();
                    break;
                case 7:
                    exercises.ExSeven();
                    break;
                case 8:
                    exercises.ExEight();
                    break;
                case 9:
                    exercises.ExNine();
                    break;
                case 10:
                    exercises.ExTen();
                    break;
                default:
                    System.out.println("This exercise does not exist.");
                    break;
            }
            System.out.println("\nChoose another one (1-10). (Or type 0 to stop the program.)");
            exNumber = scanner.nextInt();
        } while (exNumber != 0);
    }
}