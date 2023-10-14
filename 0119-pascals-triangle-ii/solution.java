class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i<=rowIndex;i++){
            List<Integer> list1 = new ArrayList<>();
            for (int j=0; j<=i; j++){
                if(i==0 || i==1){
                    list1.add(1);
                } else {
                    if(j==0 || j==i){
                        list1.add(1);
                    } else {
                        list1.add(list.get(j-1)+list.get(j));
                    }
                }
            }
            list = list1;
        }
        return list;
    }
}
