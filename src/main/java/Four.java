import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
/*        int[] arr = {1, 22, 33, 44, 5, 65, 7, 87, 91};*/
        String[] arr = {"WERTY", "Dkjfgblkdbg", "sHJs", "hsdbv", "Wrfcvgh"};
        /*System.out.println(findLastAWord(arr));*/
/*        div10(arr);*/
 /*       print(arr);*/
/*        upWords(arr);*/
        System.out.println(Arrays.toString(arr));
    }

//вывод результата самописный
/*    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/


    //содержит ли числовой массив определенное число
/*    public static boolean contains(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]="+arr[i]);
            if (arr[i] == x) return true;
        }
        return false;
    }*/


    //найти последнее слово массива, начинающееся с буквы А
  /*  public static String findLastAWord(String[] arr) {
        //тут поиск с конца массива
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("arr["+i+"]="+arr[i]);
            if (arr[i].charAt(0) == 'A') return arr[i];
        }
        return null;
    }*/

//поделить все числа на 10
/*    public static void div10(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= 10;
        }
    }*/

//если слово начинается с большой буквы
//то привести все слово в верхний регистр
/*    public static void upWords(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z')
                arr[i] = arr[i].toUpperCase();
        }
    }

}*/

//Найти максимальное значение
/*    public static int max(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];

        }
        return max;
    }*/

//объединить все слова, составив их через пробел
/*
    public static String concat(String[]arr){
        String res="";
        for(int i=0;i<arr.length-1;i++){
            res+=arr[i]+" ";
        }
        res+=arr[arr.length-1];
        return res;
    }*/
}