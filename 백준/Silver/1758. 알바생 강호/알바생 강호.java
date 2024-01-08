import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer[] arr = new Integer[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] - i < 0) continue;
            sum += arr[i] - i;
        }
        System.out.println(sum);
    }
}
