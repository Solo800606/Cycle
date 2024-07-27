public class Three {
/*    public static void main(String[] args) {
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
    }*/


    static void insertElement(int arr[], int n, int x,
                              int pos) {
        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
    }

    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;
        int x = 10, pos = 3;

        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key at specific position
        insertElement(arr, n, x, pos);
        n += 1;

        System.out.print("\n\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
