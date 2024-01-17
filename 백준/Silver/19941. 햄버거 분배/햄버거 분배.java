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
        String str = br.readLine();

        // 햄버거를 먹을 수 있는 최대 사람수는 햄버거의 갯수를 초과할 수 없다.
        // 따라서 문자열에서 H만 조회하여 앞에서 붙어 훑는다. (P와 짝을 지어줘야함 최대 index 차이는 a2)
        // H의 index와 P의 index를 기억한다.
        int count = 0;
        int H = 0;
        int P = -a2;

        while (true) {
            H = str.indexOf("H", H);
            if (H == -1) break;

            for (int i = Math.max(0, H - a2); i <= Math.min(str.length() - 1, H + a2); i++) {
                if (i <= P || str.charAt(i) != 'P') continue;
                count++;
                P = i;
                break;
            }
            H++;
        }
        System.out.println(count);
    }
}
