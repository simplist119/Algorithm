import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) continue;
            list.add(strArr[i]);
        }
        String[] arr = new String[list.size()];
        arr = list.toArray(arr);
        return arr;
    }
}