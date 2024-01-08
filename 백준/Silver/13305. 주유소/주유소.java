import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] distance = new int[count-1];
        int[] price = new int[count];

        for (int i = 0; i < count-1; i++) {
            distance[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            price[i] = sc.nextInt();
        }

        int minPrice = price[0]; 
        int sum = 0;
        for (int i = 0; i < count-1; i++) {
            if(price[i] <= minPrice) minPrice = price[i];
            sum += minPrice * distance[i];
        }
        System.out.println(sum);
    }
}
