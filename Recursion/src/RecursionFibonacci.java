import java.util.*;
public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciUsingRecursion(n));
    }
    static int fibonacciUsingRecursion(int n){
        if(n < 2 ){
            return n;
        }
        return fibonacciUsingRecursion(n-1) + fibonacciUsingRecursion(n-2);
    }
}
//fibonacciUsingRecursion(n-1) will be executed 1st till 0
//then fibonacciUsingRecursion(n-2) will be executed till 0
// 0 1 2 3 4 5 6 7  8  9
// 0 1 1 2 3 5 8 13 21 34


// Recursion Tree downwards
//                     /   f(3) // 2 is given to f(3) which is the final answer
//                    /   /  \
//                   /  f(2) + f(1) // f(2) has 1 + 1 = 2
//                  /   /   \
//                ,/, f(1) + f(0)  //1 given to f(2) (f2) = 1
//     First f(3) -> f(2) -> f(1) -> result -> f(2) -> f(0) -> result -> f(2) result -> f(3) -> f(1)