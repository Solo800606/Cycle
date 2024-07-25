import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 5, 65, 7, 87, 91};
        arr=delLast(arr);
        System.out.println(Arrays.toString(arr));
    }

    //добавить элемент в конец
    /*public static int[] addLast(int[] arr, int x) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        res[arr.length] = x;
        return res;
    }*/
    //Удаляет элемент в конеце
    public static int[] delLast(int[] arr) {
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < arr.length -1; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
