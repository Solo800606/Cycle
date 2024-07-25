// ДЗ №2 Числа наоборот

/*Необходимо реализовать метод таким образом, чтобы он возвращал строку,
в которой будут записаны все числа от x до 0 (включительно).
x может принимать значения от 0 и выше.*/

package ru.stepup.study1;

public class RevListNums {
    public static void main(String[] args) {
        String result = reverseListNums(10);
        System.out.println(result);
    }

    public static String reverseListNums(int x) {
        String res = "";
        int minNum = 0;
        for (int i = x; i >= minNum; i--) {
            res += i + " ";
        }
        return res;
    }
}
