// ДЗ №4 Степень числа

/*Необходимо реализовать метод таким образом,
чтобы он возвращал результат возведения x в степень y.

Подсказка: для получения степени необходимо умножить единицу на число x,
и сделать это y раз, т.е. два в третьей степени это 1*2*2*2*/

package ru.stepup.study1;

public class DegreeNum {
    public static void main(String[] args) {
        int result = pow(2, 5);
        System.out.println(result);
    }

    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res = res * x;
        }
        return res;
    }
}

//Тоже верное решение, но не подходит под условие (Подсказка)
/*
public static int pow(int x, int y) {
    return (int) Math.pow(x, y);
}*/
