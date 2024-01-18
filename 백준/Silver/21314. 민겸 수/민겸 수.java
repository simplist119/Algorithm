import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 최대값은 K가 존재할 경우 M들과 K를 묶어서 처리해주고, K가 존재하지 않는다면 M들을 모두 따로 처리하면 된다.
        // 최소값은 K가 존재할 경우 K앞에 오는 M들을 묶어서 처리하고 K는 따로 처리해야한다. K가 존재하지 않는다면 M들을 묶어서 처리하면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String max = "";
        String min = "";

        // 먼저 K가 존재하는지 확인을 하고 K를 기준으로 분리시켜 준다.
        if (!str.contains("K")) {
            max = "1".repeat(str.length());
            min = "1" + "0".repeat(str.length()-1);
//            min = "" + (int) Math.pow(10, str.length() - 1);
        } else {
            str = str.replaceAll("K", "K-");
            if (str.charAt(str.length() - 1) == '-') str = str.substring(0, str.length() - 1);
            StringTokenizer st = new StringTokenizer(str, "-");
            String[] arr = new String[st.countTokens()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = st.nextToken();
                if (arr[i].contains("K")) {
                    max += "5" + "0".repeat(arr[i].length()-1);
//                    max += 5 * ((int) Math.pow(10, arr[i].length() - 1));
                    if (arr[i].contains("M")) min += "1" + "0".repeat(arr[i].length()-2) + "5";
//                    if (arr[i].contains("M")) min += (int) Math.pow(10, arr[i].length() - 1) + 5;
                    else min += "5";
                } else {
                    for (int j = 0; j < arr[i].length(); j++) {
                        max += "1";
                    }
                    min += "1" + "0".repeat(arr[i].length()-1);
//                    min += (int) Math.pow(10, arr[i].length() - 1);
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
