class Solution {
    Stack<Integer> number = new Stack<>();
    Stack<Character> operand = new Stack<>();
    public int calculate(String s) {
        number.push(0);
        return readInput(s);
    }

    public int readInput(String s) {
        char prevChar = 'a';
        for(int i=0;i<s.length();i++) {
            if(isOperand(s.charAt(i))) {
                if(operand.isEmpty()) operand.push(s.charAt(i));
                else {
                    while(!operand.isEmpty() && !number.isEmpty() && isPrecedence(s.charAt(i), operand.peek())) {
                        int a = number.pop();
                        int b = number.pop();
                        char operation = operand.pop();
                        int res = performOperation(a,b,operation);
                        number.push(res);
                    }
                    if(i>0 && prevChar == '(' && s.charAt(i)=='-') number.push(0);
                    operand.push(s.charAt(i));
                }
            } else if(s.charAt(i)== ' ') {
                continue;
            } else if(s.charAt(i) == '(') {
                operand.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                while(operand.peek() != '(') {
                    int a = number.pop();
                    int b = number.pop();
                    char operation = operand.pop();
                    int res = performOperation(a,b,operation);
                    number.push(res);
                }
                operand.pop();
            } else {
                StringBuilder sb = new StringBuilder("");
                while(i<s.length() && Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                }
                i--;
                int num = Integer.parseInt(sb.toString());
                number.push(num);
            }
            prevChar = s.charAt(i);
        }
        while(!operand.isEmpty()) {
            int a = number.pop();
            int b = number.pop();
            char operation = operand.pop();
            int res = performOperation(a,b,operation);
            number.push(res);
        }
        int answer = number.pop();
        return answer;
    }

    public int performOperation(int a, int b, char operation) {
        switch(operation) {
            case '+':
                return b+a;
            case '-':
                return b-a;
            case '*':
                return b*a;
            case '/':
                return b/a;
            default:
                return -1;
        }
    }

    public boolean isPrecedence(char input, char stack) {
        if((input == '+' || input == '-') && (stack == '*' || stack == '/')) return true;
        if((input == '+' || input == '-') && (stack == '+' || stack == '-')) return true;
        if((input == '*' || input == '/') && (stack == '*' || stack == '/')) return true;
        return false;
    }

    public boolean isOperand(char c) {
        if(c=='+' || c=='-' || c=='/' || c=='*') return true;
        return false;
    }
}