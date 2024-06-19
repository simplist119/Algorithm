class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();

        while (!numbers.isEmpty()) {
            int length = 0;
            if (numbers.startsWith("one")) {
                length = 3;
                sb.append("1");
            } else if (numbers.startsWith("two")) {
                length = 3;
                sb.append("2");
            } else if (numbers.startsWith("three")) {
                length = 5;
                sb.append("3");
            } else if (numbers.startsWith("three")) {
                length = 5;
                sb.append("3");
            } else if (numbers.startsWith("four")) {
                length = 4;
                sb.append("4");
            } else if (numbers.startsWith("five")) {
                length = 4;
                sb.append("5");
            } else if (numbers.startsWith("six")) {
                length = 3;
                sb.append("6");
            } else if (numbers.startsWith("seven")) {
                length = 5;
                sb.append("7");
            } else if (numbers.startsWith("eight")) {
                length = 5;
                sb.append("8");
            } else if (numbers.startsWith("nine")) {
                length = 4;
                sb.append("9");
            } else if (numbers.startsWith("zero")) {
                length = 4;
                sb.append("0");
            }
            numbers = numbers.substring(length, numbers.length());
        }

        return Long.parseLong(sb.toString());
    }
}