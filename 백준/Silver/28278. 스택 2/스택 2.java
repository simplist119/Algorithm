import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        while (num-- > 0) {
            String temp = br.readLine();
            String[] cmd = temp.split(" ");
            if (cmd[0].equals("1")) stack.push(Integer.parseInt(cmd[1]));
            else if (cmd[0].equals("2")) {
                if (!stack.isEmpty()) sb.append(stack.pop()).append("\n");
                else {
                    sb.append("-1\n");
                }
            } else if (cmd[0].equals("3")) sb.append(stack.size()).append("\n");
            else if (cmd[0].equals("4")) {
                if (stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (cmd[0].equals("5")) {
                if (!stack.isEmpty()) sb.append(stack.peek()).append("\n");
                else sb.append(-1).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}