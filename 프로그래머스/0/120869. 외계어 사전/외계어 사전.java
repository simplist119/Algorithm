class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String dicStr : dic) {
            int count = 0;
            for (String spellStr : spell) {
                if(dicStr.contains(spellStr)) count++;
            }
            if(count==spell.length) return 1;
        }
        return 2;
    }
}