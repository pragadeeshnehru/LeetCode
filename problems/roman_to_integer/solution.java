class Solution {
    public int romanToInt(String s) {
        
        int sum = 0;

        for(int i =0; i < s.length()-1 ; i++){
            if(getNum(s.charAt(i)) < getNum(s.charAt(i+1))){
                sum -= getNum(s.charAt(i));
            } else {
                sum += getNum(s.charAt(i));
            }
        }
        sum += getNum(s.charAt(s.length()-1));
        return sum;
    }

    public int getNum(char s){
        switch(s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}