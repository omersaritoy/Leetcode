class Solution {
    public String decodeString(String s) {
            Stack<Integer> repeatStack = new Stack<>();
            Stack<String> stack = new Stack<>();
    
            String currentString = "";
            int currentNumber = 0;
    
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    currentNumber = currentNumber * 10 + c - '0';
    
                } else if (c == '[') {
                    repeatStack.push(currentNumber);
                    stack.push(currentString);
                    currentString = "";
                    currentNumber = 0;
                } else if (c == ']') {
                    String prevString = stack.pop();
                    int repeat = repeatStack.pop();
    
                    StringBuilder sb = new StringBuilder(prevString);
                    sb.append(currentString.repeat(repeat));
                    currentString = sb.toString();
                } else {
                    currentString += c;
    
                }
    
            }
    
            return currentString;
    }
}