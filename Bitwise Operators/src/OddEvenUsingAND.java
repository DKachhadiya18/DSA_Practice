public class OddEvenUsingAND {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(check(a));
    }

    static String check(int a) {
        if((a & 1) == 1){
            return "Odd";
        }
        return "Even";
    }
}

//Bitwise AND Operation
//5: 0101 5 * 1 not 5 + 1
//and   1
//--------
//   0001

// a | b | a&b
// 0 | 0 | 0
// 0 | 1 | 0
// 1 | 0 | 0
// 1 | 1 | 1   1*1 = 1
