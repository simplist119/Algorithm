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

        int count = 0;
        int H = 0;
        int P = -a2; // 초기 위치를 햄버거 위치에서 a2만큼 떨어진 곳으로 설정

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