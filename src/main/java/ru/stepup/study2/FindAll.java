// ДЗ№9 Все вхождения

/*Необходимо реализовать метод таким образом,
чтобы он возвращал новый массив, в котором записаны
индексы всех вхождений числа x в массив arr.*/

package ru.stepup.study2;

import java.util.Arrays;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 2};
        int[] newArr = findAll(arr, 2);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] findAll(int[] arr, int x) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arrNew[i] = i;
            }
        }
        return arrNew;
    }
}
