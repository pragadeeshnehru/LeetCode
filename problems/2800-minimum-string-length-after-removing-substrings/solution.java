class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (!stack.isEmpty()) {
                if ((currentChar == 'B' && stack.peek() == 'A') ||
                    (currentChar == 'D' && stack.peek() == 'C')) {
                    stack.pop();
                }  else {
                    stack.push(currentChar);
                }
            } else {
                stack.push(currentChar);
            } 
        }
        return stack.size();
    }
}
