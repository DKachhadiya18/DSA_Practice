import java.util.*;
public class CyclicSort
{
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        System.out.println(Arrays.toString(arr));
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        // index = value - 1
        int i = 0;
        while(i<arr.length){
            int correct_Index = arr[i]-1;
            if(arr[i] != arr[correct_Index]){
                int temp = arr[i];
                arr[i] = arr[correct_Index];
                arr[correct_Index] = temp;
            }else{
                i++;
            }

        }

    }
}
