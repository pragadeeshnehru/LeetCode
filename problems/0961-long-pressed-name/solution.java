class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        int i=0;
        int j=0;

        while(i < name.length() && j<typed.length()) {
            char name1 = name.charAt(i);
            char type = typed.charAt(j);

            if(name1 != type) return false;
            int countName = 0;
            while(i<m && name.charAt(i) == name1){
                countName++;
                i++;
            }
            int countTyped = 0;
            while(j<n && typed.charAt(j) == type){
                countTyped++;
                j++;
            }

            if(countName > countTyped) return false;
        }

        return i==m && j==n;
    }
}
