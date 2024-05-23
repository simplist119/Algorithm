class Solution {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        }
        return arr;
    }
    
//    public int[] solution(int[] arr, int k) {
//        return Arrays.stream(arr).map(operand -> k % 2 == 0 ? operand + k : operand * k).toArray();
//    }

//    public int[] solution(int[] arr, int k) {
//        if(k%2==0) {
//            return IntStream.of(arr).map(i->i+k).toArray();
//        }
//        return IntStream.of(arr).map(i->i*k).toArray();
//    }
}