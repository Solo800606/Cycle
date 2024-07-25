// ДЗ№6 Реверс

/*Необходимо реализовать метод таким образом,
чтобы он изменял массив arr. После проведенных
изменений массив должен быть записан задом-наперед*/

package ru.stepup.study2;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }
}
