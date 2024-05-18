import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {

        // 미리 배열의 사이즈를 알 수 없으니 배열 대신 ArrayList 활용 
        ArrayList<Integer> list = new ArrayList<>();

        // l ~ r 까지 범위를 순회
        for (int i = l; i <= r; i++) {
            
            // "0"과 "5"로만 이루어진 정수는 모두 5의 배수이므로 
            // 리소스 낭비하지 않기 위해 일단 걸러주자 
            if (i % 5 != 0) continue;

            // 어떻게 숫자가 0과 5로만 이루어져있는지 판단할지를 생각해봤는데,
            // 도저히 방법을 찾지 못하겠어서 문자열로 변환후 한자리씩 체크해보기로 했다.
            
            // 먼저 정수를 문자열로 변환
            String str = "" + i;
            
            // check 변수는 모든 자리수가 0과5로 이루어져 있는지 체크하기 위한 변수이다.
            int check = -1;
            
            // str을 한자리씩 검사하면서 0과 5로만 이루어져있는지 판단한다.
            for (int j = 0; j < str.length(); j++) {
                // 0과 5가 아닌 자리가 하나라도 존재한다면 break;
                if ((str.charAt(j) != '0') && (str.charAt(j) != '5')) {
                    check = -1;
                    break;
                }
                if (str.charAt(j) == '0' || str.charAt(j) == '5') check = 1;
            }
            
            // check가 1이라면 str의 모든 자리가 0과 5로만 이루어져 있다는 말이다.
            // list에 add!
            if (check == 1)
            {
                list.add(i);
            }
        }

        // list에 한개의 숫자로 추가되지 못했다면 [-1] return
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        // int 배열로 반환해야 하므로 list를 배열에 옮겨주자.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}