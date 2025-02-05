class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++) {
            char curr = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == curr) {
                stack.pop();
            } else{
                stack.push(curr);
            }
        }

        String str = "";
        for(char ch: stack) {
            str += ch;
        }

        return str;
    }
}
