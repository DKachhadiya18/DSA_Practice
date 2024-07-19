
public class StringPalindrome
{
    public static void main (String[]args)
    {
        String str = "0P";

        str = str.replaceAll ("\\s", "");
        str = str.replaceAll("[^a-zA-Z\\s]", "");
        String spl_Str = "";
        for (int i = 0; i < str.length (); i++)
        {
            spl_Str = str.charAt (i) + spl_Str;
        }


        System.out.println (str.toLowerCase ());
        System.out.println (spl_Str.toLowerCase ());
        System.out.println (spl_Str.toLowerCase ().equals (str.toLowerCase ()));



    }
}
