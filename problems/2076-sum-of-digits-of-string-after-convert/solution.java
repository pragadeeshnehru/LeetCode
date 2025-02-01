class Solution {
    public int getLucky(String s, int k) {
       StringBuilder number = new StringBuilder();
        for (char c : s.toCharArray()) {
            number.append(c-96);
        }

        while (k > 0) {
            int ans = 0;
            for(char c  : number.toString().toCharArray()){
                ans += c - '0';
            }
            number = new StringBuilder(String.valueOf(ans));
            k--;
        }

        return Integer.parseInt(number.toString());
    }
}
