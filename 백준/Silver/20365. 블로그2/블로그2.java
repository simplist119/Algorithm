import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // 색깔이 스위칭 되는 횟수, 첫 줄의 색과 마지막줄의 색이 같은지를 구한다.
        int count = 0;
        int result = 0;
        char firstColor = str.charAt(0);
        char lastColor = str.charAt(str.length()-1);
        char prevcolor = firstColor;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != prevcolor) count++;
            prevcolor = str.charAt(i);
        }

        if(firstColor == lastColor) result = 1 + count/2;
        else result = 2 + count/2;

        System.out.println(result);
    }
}
