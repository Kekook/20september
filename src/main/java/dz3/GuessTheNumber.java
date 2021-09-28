package dz3;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        GuessNumber();

    }

    public static void GuessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random numbers = new Random();
        int tries = 0;
        int random = numbers.nextInt(9);
        System.out.println(" Угадай число от 0-9 с трех попыток");
        while (tries < 3) {
            System.out.println("Введи число");
            int number = scanner.nextInt();
            if (number > random) {
                System.out.println(" Число больше загаданного");
            } else if (number < random) {
                System.out.println("Число меньше загаданного");
            } else if (number == random) {
                System.out.println("Вы угадали");
            }
            tries++;
        }
        System.out.println(" Вы проиграли !!! Сыграем еще ?? 1 - да, 2 - нет");
        String userChose = scanner.next();
        if ( userChose.equals("1")) {
            GuessNumber();
        }else System.out.println("Спасибо за игру");




        }
    }
