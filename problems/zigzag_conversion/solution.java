class Solution {
    public String convert(String s, int numRows) {
        int size = s.length();
        if(numRows ==1 || numRows >= size)
            return s;

        StringBuilder ans = new StringBuilder();
        // difference b/w the elements in  rows 
        // !! NOT DIAGONAL ELEMENTS !! 
        int diff = 2*(numRows-1);
        int diagonalDiff;
        int index,nxtIndex;
        for( int i =0; i < numRows; i++) {
            index = i;
            while(index<size){
                ans.append(s.charAt(index));
                if(i !=0 && i != numRows-1){
                    // difference b/w diagonal elements
                    diagonalDiff = diff-2*i;
                    nxtIndex = index + diagonalDiff;

                    if(nxtIndex < size) {
                        ans.append(s.charAt(nxtIndex));
                    }
                }
                index += diff;
            }
        }
        return ans.toString();
    }
}