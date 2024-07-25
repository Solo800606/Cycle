// ДЗ №7 Квадрат

/*Необходимо реализовать метод таким образом, чтобы он выводил на экран
квадрат из символов ‘*’ размером х, у которого х символов в ряд и
х символов в высоту.
Подсказка: метод System.out.print выводит без перехода на следующую строку,
в то время как System.out.println выводит с переходом.*/

package ru.stepup.study1;

public class SquareStars {
    public static void main(String[] args) {
        square(10);
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
