class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) 
            return stones[0];

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : stones)
            list.add(i);

        int n = list.size();
        int x = 0;
        
        while( n != 1){
            Collections.sort(list);
            x = list.get(n-1) - list.get(n-2);
            list.remove(list.get(n-1));
            list.remove(list.get(n-2));
            list.add(x);
            n--;
        }
        return (int)list.get(0);
    }
}
