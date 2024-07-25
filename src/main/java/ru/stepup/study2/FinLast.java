// ДЗ №2 Поиск последнего значения

/*Необходимо реализовать метод таким образом, чтобы он возвращал индекс
последнего вхождения числа x в массив arr. Если число не входит в массив
– возвращается -1.*/

package ru.stepup.study2;

public class FinLast {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 2, 5};
        int result = findLast(arr, 5);
        System.out.println(result);
    }

    public static int findLast(int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
