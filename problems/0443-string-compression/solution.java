class Solution {
    public int compress(char[] chars) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : chars) {
            if(!s.isEmpty() && s.peek() != c) {
                sb.append(s.peek());
                if(s.size() > 1) sb.append(s.size());
                s.clear();
            }
            s.push(c);
        }

        if(!s.isEmpty()) {
            sb.append(s.peek());
            if(s.size() > 1) sb.append(s.size());
            s.clear();
        }

        for(int i=0;i<sb.length();i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
