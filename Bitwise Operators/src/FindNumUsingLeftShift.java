public class FindNumUsingLeftShift {
    public static void main(String[] args) {
        int arr = 1000101;
        int target = 3;
        System.out.println(find(arr, target));
    }

    static int find(int arr, int target) {

        return target & (1 << (target-1));
    }
}
