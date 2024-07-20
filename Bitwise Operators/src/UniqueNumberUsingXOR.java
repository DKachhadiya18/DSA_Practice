public class UniqueNumberUsingXOR {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,2,5,3,1,4};
        System.out.println(Unique(arr));
    }
    public static int Unique(int[] arr) {
        int uniq = 0;
        for(int i : arr){
            uniq ^= i;
        }
        return uniq;
    }
}
// XOR if both numbers are same ans = 0
// a | b | a^b
// 0 | 0 | 0
// 0 | 1 | 1
// 1 | 0 | 1
// 1 | 1 | 0