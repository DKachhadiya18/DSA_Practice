import java.util.*;
public class Max
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,2,7,9,1};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 4));
    }

    // Max value from the range
    static int maxRange(int[] arr,int start, int end){
        int m = arr[start];
        for(int i = start; i < end; i++){
            if(arr[i] > m){
                m = arr[i];
            }
        }
        return m;
    }

    // Max value from the array
    static int max(int[] arr){
        int m = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > m){
                m = arr[i];
            }
        }
        return m;
    }
}
