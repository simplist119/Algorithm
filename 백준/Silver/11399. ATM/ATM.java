import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < num; i++) {
            sum1 += numArr[i];
            sum2 += sum1;
        }
        System.out.println(sum2);
    }
}
