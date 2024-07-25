// ДЗ №8 Левый треугольник

/*Необходимо реализовать метод таким образом, чтобы он выводил
на экран треугольник из символов ‘*’ у которого х символов в высоту,
а количество символов в ряду совпадает с номером строки.*/

package ru.stepup.study1;

public class LefTriangle {
    public static void main(String[] args) {
        leftTriangle(10);
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
// Треугольник наоборот
/*
public static void main(String[] args) {
    leftTriangle(5);
}

public static void leftTriangle(int x) {
    for (int i = 0; i < x; i++) {
        for (int j = x; j > i; j--) {
            System.out.print("*");
        }
        System.out.println("");
    }
}*/
//Левый треугольник
/*public static void main(String[] args) {
    leftTriangle(10);
}

public static void leftTriangle(int x) {
    for (int i = 1; i <= x; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}*/
//Правый треугольник
/*public class LefTriangle {
    public static void main(String[] args) {
        leftTriangle(10);
    }

    public static void leftTriangle(int x) {
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
}*/
