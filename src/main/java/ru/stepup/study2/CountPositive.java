// ДЗ №4 Подсчет позитива

/*Необходимо реализовать метод таким образом, чтобы он
возвращал количество положительных элементов массива arr.*/

package ru.stepup.study2;

public class CountPositive {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, 6, 7};
        int result = countPositive(arr);
        System.out.println(result);
    }

    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}
