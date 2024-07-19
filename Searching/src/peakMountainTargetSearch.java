

public class peakMountainTargetSearch
{
    public static void main (String[]args)
    {
        int[] arr = { 1,2,4,5,3,1};
        int target = 3;
        int peak = findpeak(arr);
        int first = binarySearch(arr, target, 0, peak);
        if(first == -1){
            int second = binarySearch(arr, target, peak,arr.length);

        }
        System.out.println (findpeak (arr));
    }


    static int binarySearch(int[] arr, int target,int start, int end){
        //   int start = 0;
        //   int end = findpeak(arr);
        while(start<end){
            int mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }

    static int findpeak (int[]arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }

        }
        return start;
    }
}
