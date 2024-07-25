// ДЗ №10 Угадайка

/*
Данный метод считывает с консоли введенное пользователем число и выводит,
угадал ли пользователь то, что было загадано, или нет. Перепишите этот метод
таким образом, чтобы он запускался до тех пор, пока пользователь не угадает число.
После этого выведите на экран количество попыток, которое потребовалось пользователю,
чтобы угадать число.

Ответом на задание является измененный метод.
*/

package ru.stepup.study1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        Scanner input = new Scanner(System.in);
        int guess;
        int count = 0;
        int randomNum = 3;
        do {
            System.out.print("What number am I thinking (0 to 9)? :");
            guess = input.nextInt();
            count++;
            if (guess > randomNum || guess < randomNum) {
                System.out.println("No, try again");
            }
        } while (guess != randomNum);
        System.out.println("You guessed right ");
        System.out.println("Number of guesses: " + count);
    }
}