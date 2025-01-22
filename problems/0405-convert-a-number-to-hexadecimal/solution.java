class Solution {
    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if(num == 0) return "0";
        StringBuilder result = new StringBuilder();
        int count = 0;
        while(num != 0 && count<8){
            result.append(map[num & 15]);
            num = num >> 4;
            count++;
        }
        return result.reverse().toString();
    }
    
    
}
