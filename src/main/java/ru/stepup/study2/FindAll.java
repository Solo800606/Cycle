package ru.stepup.study2;

import java.util.Arrays;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 2};
        findAll(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] findAll(int[] arr, int x) {
        int count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return new int[]{count};
    }
}