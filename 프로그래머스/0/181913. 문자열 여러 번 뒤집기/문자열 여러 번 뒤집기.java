class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] ch = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int open_range = queries[i][0];
            int close_range = queries[i][1];
            for (int j = 0;j<(close_range-open_range+1)/2; j++) {
                if(open_range+j >= close_range-j) break;
                char tmp = ch[open_range+j];
                ch[open_range+j] = ch[close_range-j];
                ch[close_range-j] = tmp;
            }
        }

        return new String(ch);
    }
}