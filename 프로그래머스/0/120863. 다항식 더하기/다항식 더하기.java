// " "로 split
// String 함수 contains와 substring사용해서 정수는 정수끼리 변수는 변수끼리 더하기
class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
//        System.out.println("arr  == " + Arrays.toString(arr));
        int int1 = 0;
        int var1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")) continue;
            if (arr[i].contains("x")) {
                if(arr[i].equals("x")) var1 += 1;
                else var1 += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
            }
            else int1 += Integer.parseInt(arr[i]);
        }

        return (var1 != 0 ? var1 > 1 ? var1 + "x" : "x" : "")
                + (int1 != 0 ? (var1 != 0 ? " + " : "")
                + int1 : var1 == 0 ? "0" : "");
//        if (var1 > 0 && int1 > 0) return var1 + "x + " + int1;
//        else if (var1 > 0) return var1 + "x";
//        else return int1 + "";
    }
}