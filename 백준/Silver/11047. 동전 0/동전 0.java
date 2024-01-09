import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int money = sc.nextInt();
        Integer[] arr = new Integer[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;
        for (int i = 0; i < count; i++) {
            if(money/arr[i] == 0) continue;
            int quotient = money/arr[i];
            result += quotient;
            money %= arr[i];
        }
        System.out.println(result);
    }
}