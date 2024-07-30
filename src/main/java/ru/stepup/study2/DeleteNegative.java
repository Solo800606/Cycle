// ДЗ №10 Удалить негатив

/*Необходимо реализовать метод таким образом, чтобы он возвращал
новый массив, в котором записаны все элементы массива arr кроме отрицательных.*/

package ru.stepup.study2;

import java.util.Arrays;

public class DeleteNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 10, -5, 2};
        int[] newArr = deleteNegative(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] deleteNegative(int[] arr) {
        //Ищем все позитивные числа, для определения размера количества элементов массива
        //Здесь count содержит количество элементов и всё ...
        int count = 0;
        for (int value : arr) {
            if (value > 0) {
                count++;
            }
        }
        // Создаем новый массив для "хранения индексов", с ранее выявленным количеством элементов в count
        int[] arrNew = new int[count];
        // Этот цикл снова проходит по исходному массиву arr и когда он находит положительные числа,
        // то "сохраняет" текущий индекс в arrNew
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
        //если надо вывести индекс то указываем i, если элемент то arr[i]
                arrNew[num] = arr[i];
                num++;
            }
        }
        return arrNew;
    }
}

/* int[] result = new int[arr.length];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[j] = i; j++;
            }
        }
        return result;
    }*/