// ДЗ№8 Возвратный реверс

/*Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, в котором сначала идут элементы
первого массива (arr1), а затем второго (arr2).*/

package ru.stepup.study2;

import java.util.Arrays;

public class Unification {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {7, 8, 9};
        arr = concat(arr, arr2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}

