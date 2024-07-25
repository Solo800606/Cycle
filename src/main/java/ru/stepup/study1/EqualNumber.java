// ДЗ №6 Одинаковость

/*Необходимо реализовать метод таким образом, чтобы он возвращал true,
если все знаки числа одинаковы, и false в ином случае.

Подсказки:
int x=123%10; // х будет иметь значение 3
int у=123/10; // у будет иметь значение 12
*/

package ru.stepup.study1;

public class EqualNumber {
    public static void main(String[] args) {
        Boolean result = equalNum(1111111);
        System.out.println(result);
    }

    public static boolean equalNum(int x) {
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x % 10;
            x /= 10;
        }
        if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3] && arr[3] == arr[0]) {
            return true;
        }
        return false;
    }
}


        /*int digit = x % 10;
        int lastnum;
        for (int i = 1; x > 0; lastnum = x % 10) {
            if (lastnum == digit)
                i++;
        }
        x /= 10;*/