import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 큰수를 뺼수록 결과값이 커지므로 덧셈들을 묶어서 뺄셈을 해주면 된다.
        // 따라서 - 기호를 기준으로 StringToken을 나눈다.
        // 그 결과값들인 string 배열을 + 기준으로 parsing해서 각각 더해준 다음 첫번째에서 나머지들을 빼주면 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int countTokens = st.countTokens();
        String[] arr = new String[countTokens];
        int[] arr2 = new int[countTokens];

        for (int i = 0; i < countTokens; i++) {
            arr[i] = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(arr[i], "+");
            int countTokens2 = st2.countTokens();
            for (int j=0; j< countTokens2; j++){
                arr2[i] += Integer.parseInt(st2.nextToken());
            }
        }

        int result = arr2[0];
        for (int i = 1; i < countTokens ; i++) {
            result -=arr2[i];
        }

        System.out.println(result);
    }
}
