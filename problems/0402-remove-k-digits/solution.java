class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder s = new StringBuilder();
        s.append(num.charAt(0));
        for (int i = 1; i < num.length(); ++i) {
            if (k > 0 && s.length() > 0 && num.charAt(i) < s.charAt(s.length() - 1)) {
                s.deleteCharAt(s.length() - 1);
                k--;
                i--;
                continue;
            }
            s.append(num.charAt(i));
        }
        while (k > 0 && s.length() > 0) {
            s.deleteCharAt(s.length() - 1);
            k--;
        }
        while (s.length() > 0 && s.charAt(0) == '0') {
            s.deleteCharAt(0);
        }
        if (s.length() == 0) {
            s.append('0');
        }
        return s.toString();
    }
}
