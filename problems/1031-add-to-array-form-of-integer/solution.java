class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l1 = new ArrayList<>();
        int i = num.length - 1;

        while(i >= 0 || k > 0){
            if(i>=0) k+= num[i];
            l1.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(l1);
        return l1;

    }
}
