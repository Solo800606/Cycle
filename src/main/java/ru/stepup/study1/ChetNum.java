// ДЗ №3 Четные числа

/*Необходимо реализовать метод таким образом, чтобы он возвращал строку,
в которой будут записаны все четные числа от 0 до x (включительно).
Подсказа для обеспечения качества кода: инструкцию if использовать не следует.*/

package ru.stepup.study1;

public class ChetNum {
    public static void main(String[] args) {
        String result = chet(26);
        System.out.println(result);
    }

    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res += i + " ";
        }
        return res;
    }
}