// Order agnostic: you dont know the order of the array
public class OrderAgnostic
{
    public static void main (String[]args)
    {
// 	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 3;

        int ans = 0;
        if(arr[0] < arr.length-1){
            ans = binarySearchAsc(arr,target);
        }
        else{
            ans = binarySearchDesc(arr,target);
        }

        System.out.println(ans);

    }

    static int binarySearchAsc (int[]arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }

        }
        return -1;

    }


    static int binarySearchDesc (int[]arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (target < arr[mid])
            {
                start = mid + 1;
            }
            else if (target > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }

        }
        return -1;

    }
}
