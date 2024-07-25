// ДЗ №10 Удалить негатив

/*Необходимо реализовать метод таким образом, чтобы он возвращал
новый массив, в котором записаны все элементы массива arr кроме отрицательных.*/

package ru.stepup.study2;

import java.awt.*;
import java.util.Arrays;

public class DeleteNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5};
        deleteNegative(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] deleteNegative(int[] arr) {
        int dst = 0;
        for (int src = 0; src < arr.length; ++src){
            if (arr[src] >= 0)
                arr[dst++] = arr[src];}
        return new int[]{dst};
    }
}