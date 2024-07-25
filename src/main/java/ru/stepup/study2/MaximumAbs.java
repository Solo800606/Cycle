// ДЗ №3 Поиск последнего значения

/*Необходимо реализовать метод таким образом, чтобы он возвращал
наибольшее по модулю (то есть без учета знака) значение массива arr.*/

package ru.stepup.study2;

import java.util.Arrays;

public class MaximumAbs {
    public static void main(String[] args) {
        int[] arr = {12, 2, -300, 4, 100};
        int result = maxAbs(arr);
        System.out.println(result);
    }

    public static int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
