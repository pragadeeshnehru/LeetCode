class Solution {
    public String reverseWords(String s) {
        String[] strings  = s.trim().split("\\s+");
        int i =0;
        int j = strings.length -1;
        while(i<j) {
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
            i++;
            j--;
        }

        return String.join(" ", strings);
    }
}
