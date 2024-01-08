import javax.lang.model.SourceVersion;
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
        Arrays.sort(arr, (i1, i2) -> i2 - i1);
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if(i%3 == 2) continue;
            sum+= arr[i];
        }
        System.out.println(sum);
    }
}
