import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        int count = 1;

        while (true){
            // 1. 마지막 자리 숫자가 1이라면 마지막 자리 1을 제거 ( /10 )
            if (a2 % 10 == 1) {
                a2 = a2 / 10;
                count++;
            }
            // 2. 마지막 자리 숫자가 1이 아니고 짝수라면 나누기 2 ( /2 )
            else if(a2 % 2 == 0) {
                a2 = a2 / 2;
                count++;
            }
            // 3. 마지막 자리 숫자가 짝수가 아니면서 1이 아닌 홀수 이면 return -1
            else{
                count = -1;
                break;
            }

            // 2번째 숫자가 1번째 숫자와 같아지면 count를 출력
            if(a2 == a1) break;
            // 2번째 숫자가 1번재 숫자보다 작아지면 -1을 출력
            if(a2 < a1) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}