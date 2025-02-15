class Solution {
    public double separateSquares(int[][] squares) {
        double left = Double.MAX_VALUE, right = -Double.MIN_VALUE;
        int n = squares.length;
        double totalArea = 0.0;
        for(int[] s : squares) {
            int y=s[1], l= s[2];
            totalArea += (double) l*l;
            left = Math.min(left,y);
            right = Math.max(right, y+l);
        }

        double tgt = totalArea / 2.0;

        for(int i=0;i<100;i++) {
            double mid = (left+right) /2.0;
            double below =0.0;

            for(int[] square : squares) {
                double y = square[1], l = square[2];
                double top = y+l;
                if(mid<=y) {
                    below += 0;   
                } else if(mid >= top) {
                    below += (l*l);
                } else {
                    below += (mid-y) *l;
                }
            }
            if(below < tgt) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
