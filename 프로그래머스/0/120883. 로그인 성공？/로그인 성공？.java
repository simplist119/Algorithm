class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int count = 0;
        for (String[] arr : db) {
            if(id_pw[0].equals(arr[0])){
                count++;
                if(id_pw[1].equals(arr[1])) count++;
            }
        }

        if(count==2) return "login";
        if(count==1) return "wrong pw";
        return "fail";
    }
}