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
        for (int i = 0; i < arr.length; i++) {
            /*if (i < pos) tmp[i] = arr[i];
            else if (i == pos) tmp[i] =;
            else tmp[i] = arr[i - 1];*/
            tmp[i] = arr[i];
        }
        int j = arr.length;
        for (int i = 0; i < ins.length; i++) {
            tmp[j++] = ins[i];
        }
        return tmp;
    }
}

