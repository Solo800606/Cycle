// ДЗ №1 Строка сравнения

/*Необходимо реализовать метод таким образом,
чтобы он возвращал строку, в которой будут записаны все
числа от 0 до x (включительно). x может принимать значения от 0 и выше.*/

package ru.stepup.study1;

public class Nums {
    public static void main(String[] args) {
        String result = listNums(10);
        System.out.print(result);
    }

    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i + " ";
        }
        return res;
    }
}


/*
public static String listNums(int x) {
    StringBuilder num = new StringBuilder();
    for (int i = 0; i < x; i++) {
        num.append(i).append(" ");
    }
    num.append(x);
    return num.toString();
}*/
