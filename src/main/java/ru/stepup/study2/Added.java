package ru.stepup.study2;

import java.util.Arrays;

public class Added {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
        add(arr, 4, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] add(int[] arr, int x, int pos) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        newArr[pos] = x;}
        return newArr;
    }

}
