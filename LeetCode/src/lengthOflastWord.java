
public class lengthOflastWord
{
    public static void main(String[] args) {
        String str = "Hello World";
        String[] spl_str = str.split(" ");

        int count = 0;
        String elem = spl_str[spl_str.length-1];
        for(int i = 0; i < elem.length(); i++){
            count++;
        }
        System.out.println(count);
        // for(String i: spl_str){
        //     System.out.println(i);
        // }
    }
}
