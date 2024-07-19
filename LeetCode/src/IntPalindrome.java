public class IntPalindrome {
    public static void main(String[] args) {
        int x = 121;
        int val = x;
        int a = 0;
        while(x > 0 ){
            int last = x%10;
            a = a * 10+last;
            x = x/10;
        }
        System.out.println(val == a);

    }
}