import java.util.*;
public class plusOne
{
    public static void main (String[]args)
    {
        int[] digits = { 9 };
        int num = split (digits);
        int ans = add (num);
        int[] ansToArray = newArray (ans);
        System.out.println (Arrays.toString (ansToArray));


    }

    static int[] newArray (int num)
    {
        int length = String.valueOf (num).length ();
        int[] ans = new int[length];
// 	System.out.println (ans);
        for (int i = length - 1; i >= 0; i--)
        {
            ans[i] = num % 10;
            num /= 10;

        } return ans;
    }



    static int add (int num)
    {
        return num + 1;
    }


    static int split (int[]digits)
    {
        int num = 0;
        for (int i = 0; i < digits.length; i++)
        {
            num = num * 10 + digits[i];
        }
        return num;

    }
}
