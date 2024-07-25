package ru.stepup.study2;

public class Palindrom {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 3, -2, 1};
        boolean result = palindrom(arr);
        System.out.println(result);
    }

    public static boolean palindrom(int[] arr) {
        int num = arr[0];
        int n = arr.length;
        for (int i = 0; i <= n / 2 && n != 0; i++) {
            if (arr[i] != arr[n - i - 1]) {
                num = 1;
                return false;
            }
        }
        return true;
    }
}
