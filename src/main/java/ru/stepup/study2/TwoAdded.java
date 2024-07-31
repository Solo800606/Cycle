package ru.stepup.study2;

import java.util.Arrays;

public class TwoAdded {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] ins = {77, 88, 99};
        int[] result = add(arr, ins, 3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] tmp = new int[arr.length + ins.length];
        for (int i = 0; i < tmp.length; i++) {
            if (i < pos) {
                tmp[i] = arr[i]; // "Заполняем" элемент tmp[i] значением из arr[i].
            } else if (i < pos + ins.length) {
                tmp[i] = ins[i - pos]; // "Вставляем" элементы из массива ins
            } else {
                tmp[i] = arr[i - ins.length]; // Продолжаем "копировать" оставшиеся элементы из arr
            }
        }
        return tmp;
    }
}

///Вариант 2
/*int[] tmp = new int[arr.length + ins.length];
        for (int i = 0; i < arr.length; i++) {
        if (i < pos) tmp[i] = arr[i];
        else if (i == pos) {
        for (int j = 0; j < ins.length; j++) {
tmp[i++] = ins[j];
        }
        continue;
        }
tmp[i] = arr[i];
        }
        return tmp;
    }*/
///Вариант 1
  /*else if (i == pos) {
tmp[i] = ins[i];
        }
tmp[i] = arr[i];
        }*/