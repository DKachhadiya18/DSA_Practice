
public class fibonacciSeries
{
    public static void main(String[] args) {
        int num = 1;
        System.out.println(fibonacci(num));
    }
    static int fibonacci(int num){
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i<=num;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}

// 0 1 1 2 3
