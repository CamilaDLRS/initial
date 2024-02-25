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
        System.out.print("Type an number: ");
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
        System.out.println("Lets check the avarege of 3 number");

        for (int i = 0; i < 3; i++) {
            System.out.print("Type a number: ");
            avarege += this.scanner.nextInt();
        }

        System.out.println("The avarege is = " + avarege / 3);
    }

    public void ExFour() {
        System.out.println("Lets check if you can go to the jale \n Type your age: ");
        double userAge =  this.scanner.nextInt();

        if (userAge >= 18) {
            System.out.println("Yes, you can");
        }
        else {
            System.out.println("No, you can not");
        }
    }

    public void ExFive() {
        System.out.print("Informe a temperatura em C°: ");
        double tempCelsius = scanner.nextDouble();
        double tempFahrenehit = tempCelsius * 1.8 + 32;
        System.out.println(tempFahrenehit + "F°");
    }

    public void ExSix() {
        System.out.println("Lançando dado...");
        Random random = new Random();
        int dado = random.nextInt(6);
        System.out.println("Dado n°: " + (dado + 1));
    }

    public void ExSeven() {
        double doubleEscolha = Math.random() * 4;
        int escolhaRandom = (int) doubleEscolha;

        System.out.print("Escolha [1]Pedra [2]Papel [3]Tesoura: ");
        int escolhaUsuario = scanner.nextInt();

        if (escolhaRandom == 1) {
            if (escolhaUsuario == 2) {
                System.out.println("Você ganhou, a maquina escolheu Pedra");
            } else if (escolhaUsuario == 3) {
                System.out.println("Você perdeu, a maquina escolheu Pedra");
            } else {
                System.out.println("Empate, a maquina escolheu Pedra");
            }
        } else if (escolhaRandom == 2) {
            if (escolhaUsuario == 3) {
                System.out.println("Você ganhou, a maquina escolheu Papel");
            } else if (escolhaUsuario == 1) {
                System.out.println("Você perdeu, a maquina escolheu Papel");
            } else {
                System.out.println("Empate, a maquina escolheu Papel");
            }
        } else {
            if (escolhaUsuario == 1) {
                System.out.println("Você ganhou, a maquina escolheu Tesoura");
            } else if (escolhaUsuario == 2) {
                System.out.println("Você perdeu, a maquina escolheu Tesoura");
            } else {
                System.out.println("Empate, a maquina escolheu Tesoura");
            }
        }
    }

    public void ExEight() {
        System.out.print("Digite um N° para ver seu fatorial: ");
        int num = scanner.nextInt();
        int resultado = num;
        String frase = String.valueOf(num);
        for (int i = 1; i < num; i++) {
            int proximo = num - i;
            resultado *= proximo;
            frase += " * " + String.valueOf(proximo);
        }
        System.out.println(frase + " = " + resultado);
    }

    public void ExNine() {
        System.out.println("Lets check if an number is Prime: ");
        int num = this.scanner.nextInt();
        boolean ePrimo = true;
        if (num > 0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " não é primo");
                    ePrimo = false;
                    break;
                }
            }
            if (ePrimo) {
                System.out.println(num + " é primo");
            }
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