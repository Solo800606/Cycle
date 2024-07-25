// ДЗ №5 Длина числа

/*
Необходимо реализовать метод таким образом,
чтобы он возвращал количество знаков в числе x.
x может принимать значения от 0 и выше.
Подсказка:
int у=123/10; // у будет иметь значение 12
*/

package ru.stepup.study1;

public class LengthNumber {
    public static void main(String[] args) {
        int result = numLen(12345678);
        System.out.println(result);
    }

    public static int numLen(long x) {
        int count = 0;
        for (; x > 0; x /= 10) {
            count++;
        }
        return count;
    }
}
