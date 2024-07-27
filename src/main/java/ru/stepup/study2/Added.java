package ru.stepup.study2;

import java.util.Arrays;

public class Added {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7};
        int [] result = add(arr, 4, 3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] add(int[] arr, int x, int pos) {
        int newArr[] = new int[arr.length + 1];
        int n = 7;
        for (int i = n - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
        return newArr;
    }
}



/*
int newArr[] = new int[pos + 1];
        for (int i = 0; i < pos; i++)
newArr[i] = arr[i];
newArr[pos] = x;
        return newArr;
    }*/
