import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 제일 큰 음료수에 다른 음료수의 절반씩을 계속 부어주면 된다.
        // 1. 가장 양이 많은 음료를 찾는다.
        // 2. 나머지 음료들의 절반을 가장 양이 많은 음료에 더해주면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int biggest = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] >= arr[biggest]) biggest = i;
        }
        double result = arr[biggest];

        for (int i = 0; i < N; i++) {
            if(i == biggest) continue;
            result += (double) arr[i] /2;
        }
        System.out.println(result);
    }
}