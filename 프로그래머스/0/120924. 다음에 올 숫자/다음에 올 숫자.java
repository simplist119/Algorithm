class Solution {
    public int solution(int[] common) {
        String type = "";
        int diff = 0;
        int lastIdx = common.length-1;
        
        if(common[lastIdx]-common[lastIdx-1] == common[lastIdx-1]-common[lastIdx-2]) {
            type = "등차";
            diff = common[1] - common[0];
            return common[lastIdx] + diff;
        }
        else {
            type = "등비";
            diff = common[1] / common[0];
            return common[lastIdx] * diff;
        }
    }
}