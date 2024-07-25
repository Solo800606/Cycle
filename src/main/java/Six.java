import java.util.Arrays;

public class Six {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33};
        int[] arr2 = {9, 88, 45};
        arr=addUniq(arr,arr2);
        System.out.println(Arrays.toString(arr));
    }
//добавить в конец такие элементы второго массива, которых нет в первом
    public static int[] addUniq(int[]arr, int[]arr2){
//Вариант №1 заводим временный массив, по размеру, как оба вместе
//тут мы копируем элементы arr 1, 22, 33 + 0, 0, 0 - нули это количество элементов arr2
//и счетчик j будет двигатся с первого нуля и будем двигатся пока не кончится массив arr2
        int[]tmp=new int[arr.length+arr2.length];
//Вариант №2 элементы первого массива копируем без изменений,
//тут счетчик движится по массиву arr2
        for(int i=0;i<arr.length;i++){
            tmp[i]=arr[i];
        }
//элементы второго копируем, только если их нет в массиве arr
//заметьте, что j двигается не каждую итерацию, а только, когда срабатывает if
        int j = arr.length;
        for(int i=0;i<arr2.length;i++){
//тут мы говорим, если arr не содержит элементы arr2 -
            if(!contains(arr, arr2[i]))
//тогда тут присваиваем элементы из arr2, которого нет в arr
                tmp[j++]=arr2[i];
        }
//Возвращаем массив правильного размера, т.е. удаляем лишние нули 
        int[]res=new int[j];
        for(int i=0;i<j;i++){
            res[i]=tmp[i];
        }
        return res;
    }
    public static boolean contains(int[]arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return true;
        }
        return false;
    }

}
