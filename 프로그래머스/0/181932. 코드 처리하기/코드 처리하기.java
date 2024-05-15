class Solution {
    public String solution(String code) {
        // 시작 mode는 0
        int mode = 0;

        //문자열을 char 배열로 변환
        char[] arr = code.toCharArray();

        //결과를 저장하기 위한 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 배열 arr을 순회
        for (int i = 0; i < arr.length; i++) {

            // '1'일 경우 모드 체인지
            if (arr[i] == '1') {
                mode = mode == 1 ? 0 : 1;

            // 모드가 0인 경우 짝수번째만 sb에 추가
            } else if (mode == 0 && i % 2 == 0) {
                sb.append(arr[i]);

            // 모드가 0인 경우 홀수번째만 sb에 추가
            } else if (mode == 1 && i% 2 == 1){
                sb.append(arr[i]);
            }
        }

        String str = sb.toString();
        if(str.length() ==0) return "EMPTY";
        else return str;
    }
}