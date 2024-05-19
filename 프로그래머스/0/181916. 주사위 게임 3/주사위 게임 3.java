import java.util.*;

// 아 제발 장난하지마세요 이게 어떻게 레벨 0이야...
class Solution {
    public int solution(int a, int b, int c, int d) {

        
        Integer[] keys = {a, b, c, d};
        
        // 주사위 숫자를 key, 횟수를 value로 갖는 map 생성
        // map을 쓰는게 가장 좋은 방법인 것 같았다.
        // 근데 풀다보니 lv0치고 너무 어렵다.. 방향을 잘못잡았나...
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        // getOrDefault 메서드를 활용해 맵에 데이터를 입력한다. 
        for (Integer key : keys) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // 모두 같은 숫자가 나온다면 map의 사이즈는 1개이다.
        if (map.size() == 1) answer = a * 1111;
        
        // map의 사이즈가 2인 경우는 2가지가 있는데,
        // 첫번째 경우는 다른 숫자가 3번, 1번씩 나오는 경우이고,
        // 두번째 경우는 다른 숫자가 2번씩 나오는 경우이다.
        if (map.size() == 2) {
            if (map.containsValue(3)) {
                int three_num = 0;
                int one_num = 0;
                // map을 <key,value> 한 쌍씩 순회하는 방법이다.
                // entryset은 <key,value> 한 쌍을 말한다.
                for (Map.Entry<Integer, Integer> me : map.entrySet()) {
                    if (me.getValue() == 3) three_num = me.getKey();
                    if (me.getValue() == 1) one_num = me.getKey();
                }
                answer = (int) Math.pow(10 * three_num + one_num, 2);
            } else {
                int i = 1;
                int p = 0;
                int q = 0;
                // 다른 숫자가 2회씩 나온 경우인데 key값을 어떻게 구분해야할지 마땅히 떠오르지 않아 이렇게 구현했다.
                for (Map.Entry<Integer, Integer> me : map.entrySet()) {
                    if (i == 1){
                        p = me.getKey();
                        i++;
                    }
                    else q = me.getKey();
                }
                answer = (p + q) * Math.abs(p - q);
            }

        }
        
        // 2,1,1 로 나온 경우이다.
        if(map.size()==3){
            answer = 1;
            for(Map.Entry<Integer,Integer> me : map.entrySet()){
                if(me.getValue()==1) answer *= me.getKey();
            }

        }
        // a,b,c,d 네 개의 숫자중에서 가장 작은 수를 찾는 방법인데
        // min 메서드에 min메서드를 매개변수로 줬다. 이건 좀 좋은 방법인 것 같다.
        if(map.size()==4){
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }

        return answer;
    }
}