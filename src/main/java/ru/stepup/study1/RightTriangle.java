// ДЗ №9 Правый треугольник

/*Необходимо реализовать метод таким образом, чтобы он выводил на
экран треугольник из символов ‘*’ у которого х символов в высоту,
а количество символов в ряду совпадает с номером строки, при этом
треугольник выровнен по правому краю. Подсказка:
перед символами ‘*’ следует выводить необходимое количество пробелов.*/

package ru.stepup.study1;

public class RightTriangle {
    public static void main(String[] args) {
        rightTriangle(10);
    }

    public static void rightTriangle(int x) {
        int i, j, space;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

