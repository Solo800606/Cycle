// ДЗ№9 Все вхождения

/*Необходимо реализовать метод таким образом,
чтобы он возвращал новый массив, в котором записаны
индексы всех вхождений числа x в массив arr.*/

package ru.stepup.study2;

import java.util.Arrays;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 4, 2, 2};
        int[] newArr = findAll(arr, 2);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] findAll(int[] arr, int x) {
        //Ищем все позитивные числа
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }
        // Создаем новый массив для "хранения индексов"
        int[] arrNew = new int[count];
        // Этот цикл снова проходит по исходному массиву arr и когда он находит x, то "сохраняет" текущий индекс в arrNew
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arrNew[index] = i;
                index++;
            }
        }
        return arrNew;
    }
}