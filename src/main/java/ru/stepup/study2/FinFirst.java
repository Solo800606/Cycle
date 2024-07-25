// ДЗ №1 Поиск первого значения

/*Необходимо реализовать метод таким образом, чтобы он возвращал
индекс первого вхождения числа x в массив arr. Если число не входит в массив
– возвращается -1.*/

package ru.stepup.study2;

public class FinFirst {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 2, 2, 5};
        int result = findFirst(arr, 5);
        System.out.println(result);
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}