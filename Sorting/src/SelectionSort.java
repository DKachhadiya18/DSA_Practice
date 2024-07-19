import java.util.*;

public class SelectionSort
{
    public static void main (String[]args)
    {
        int[] nums = { 14, 15, 11, 11, 12, 13 };
        selectionSort (nums);
        System.out.print (Arrays.toString (nums));
    }

    static void selectionSort (int[]nums)
    {

        for (int i = 0; i < nums.length - 1; i++)
        {
            int min = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;

        }

    }


}
