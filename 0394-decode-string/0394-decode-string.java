class Solution {
    public String decodeString(String s) {
        Stack<String> main = new Stack<>();
        Stack<Integer> num = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    digit = digit * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                i--; // Decrement i to account for the last digit
                num.push(digit);
            } else if (ch != ']') {
                main.push(String.valueOf(ch));
            } else {
                String str = "";
                while (!main.peek().equals("[")) {
                    str = main.pop() + str;
                }
                main.pop(); // Remove the '['
                int repetition = num.pop();
                StringBuilder sb = new StringBuilder();
                while (repetition > 0) {
                    sb.append(str);
                    repetition--;
                }
                main.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!main.isEmpty()) {
            ans.insert(0, main.pop());
        }
        return ans.toString();
    }
}
