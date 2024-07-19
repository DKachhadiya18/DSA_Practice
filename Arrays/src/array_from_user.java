
import java.util.Scanner;

public class array_from_user{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arra = new int[5];
            for(int i = 0; i < 5; i++){
                arra[i] = sc.nextInt();
            }

            // for(int i = 0; i < 5; i++){
            //     System.out.print(arra[i] + " ");
            // }

            for(int num : arra){            // for each loop
                System.out.print(num + " ");
            }

        }
    }
}