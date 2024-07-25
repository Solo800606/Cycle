// ДЗ№7 Возвратный реверс

/*Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
в котором значения массива arr записаны задом наперед.*/

package ru.stepup.study2;

import java.util.Arrays;

public class ReverseBack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseBack(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseBack(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}
