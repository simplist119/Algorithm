import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 오름 차순으로 정렬
        // 0번째와 1번째를 더한 값을 출력하면 된다.
        // 단, 운동기구의 갯수가 1이라면 0번째만 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        long maxNum = 0;

        if(N%2==0){
            for (int i = 0; i < N/2; i++) {
                maxNum = Math.max(maxNum, arr[i]+arr[N-1-i]);
            }
        }
        else{
            maxNum = arr[N-1];
            for (int i = 0; i < (N-1)/2; i++) {
                maxNum = Math.max(maxNum, arr[i]+arr[N-2-i]);
            }
        }
        System.out.println(maxNum);
    }
}
