import java.util.*;

// set : 중복X, 순서X
// LinkedHashSet : 중복X, 순서X
// TreeSet : 중복X, 순서X, 정렬O
class Solution {
    public String[] solution(String[] strings, int n) {
        // 1. strings를 순회하면서 n번째 알파벳만 alphabetSet에 모으기 (TreeSet 사용하면 자동 오름차순 정렬)
        Set<Character> alphabetSet = new TreeSet<>();
        List<String> strList = new ArrayList<>();
        for (String str : strings) {
            alphabetSet.add(str.charAt(n));
        }
        System.out.println("alphabetSet = " + alphabetSet);

        // 2. AlphabetSet을 순회하면서 해당 원소를 n번째에 포함하고 있는 문자열을 배열 strings에서 찾고
        //    tempSet에 모았다가(이것 또한 TreeSet을 사용한다. 오름차순 정렬하기 위해.) strList (ArrayList)에 추가하기
        for (Character c : alphabetSet) {
            Set<String> tempSet = new TreeSet<>();
            for (String str : strings) {
                if (str.charAt(n) == c) tempSet.add(str);
            }
            strList.addAll(tempSet);
        }

        // 3. 결과 return 하기
        return strList.toArray(new String[]{});
    }
}