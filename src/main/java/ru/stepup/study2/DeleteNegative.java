// ДЗ №10 Удалить негатив

/*Необходимо реализовать метод таким образом, чтобы он возвращал
новый массив, в котором записаны все элементы массива arr кроме отрицательных.*/

package ru.stepup.study2;

import java.awt.*;
import java.util.Arrays;

public class DeleteNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 2, -5, 2};
        int[] newArr = deleteNegative(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] deleteNegative(int[] arr) {
        int[] result = new int[arr.length];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[j] = i; j++;
            }
        }
        return result;
    }
}