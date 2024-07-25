public class Three {
    public static void main(String[] args) {
//обычное создание массива на 10 элементов
        int[] arr = new int[10];
        System.out.println("Array length is " + arr.length);
        System.out.println("first elem is [0]=" + arr[0]);
        System.out.println("last elem is [" + (arr.length - 1) + "]=" + arr[arr.length - 1]);
//создание и инициализация массива, возможно только в одну строку
        char[] arr2 = {'A', 'B', 'F', 'V'};
        System.out.println("Array length is " + arr2.length);
        System.out.println("first elem is [0]=" + arr2[0]);
//создание массива строк
        String[] arr3 = new String[5];
        System.out.println("Array length is " + arr3.length);
        System.out.println("first elem is [0]=" + arr3[0]);
        System.out.println(arr3[15]);//ArrayIndexOutOfBoundsException
    }
}
