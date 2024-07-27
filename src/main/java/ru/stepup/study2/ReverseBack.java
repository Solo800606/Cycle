// ДЗ№7 Возвратный реверс

/*Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
в котором значения массива arr записаны задом наперед.*/

package ru.stepup.study2;

import java.util.Arrays;

public class ReverseBack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseBack(arr);
        System.out.println(Arrays.toString(reversedArr));
    }

    public static int[] reverseBack(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }
}
