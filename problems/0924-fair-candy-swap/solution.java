class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1 =0 , s2 =0;
        for(int candy : aliceSizes) {
            s1 += candy;
        }

        for(int candy : bobSizes) {
            s2 += candy;
        }

        int diff = (s2-s1) /2;

        HashSet<Integer> set = new HashSet<>();
        for(int candy : bobSizes){
            set.add(candy);
        }

        for(int candy: aliceSizes) {
            int a = candy + diff;
            if(set.contains(a)) {
                return new int[]{candy, a};
            }
        }
        return new int[]{};
    }
}
