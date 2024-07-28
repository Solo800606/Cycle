// ДЗ №11 Добавление в массив

/*Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
который будет содержать все элементы массива arr, однако в позицию pos будет
вставлено значение x.*/

package ru.stepup.study2;

import java.util.Arrays;

public class Added {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] result = add(arr, 4, 6);
        System.out.println(Arrays.toString(result));
    }

    public static int[] add(int[] arr, int x, int pos) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < pos) newArr[i] = arr[i];
            else if (i == pos) newArr[i] = x;
            else newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}