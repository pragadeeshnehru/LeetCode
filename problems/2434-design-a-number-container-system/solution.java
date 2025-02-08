class NumberContainers {
    HashMap<Integer, Integer> map;
    HashMap<Integer, TreeSet<Integer>> numberToIndex;
    public NumberContainers() {
        numberToIndex = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(map.containsKey(index)) {
            int oldNumber = map.get(index);
            if(numberToIndex.containsKey(oldNumber)) {
                numberToIndex.get(oldNumber).remove(index);
                if(numberToIndex.get(oldNumber).isEmpty()) {
                    numberToIndex.remove(oldNumber);
                }
            }
        }

        map.put(index, number);
        numberToIndex.computeIfAbsent(number,k -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
        if(!numberToIndex.containsKey(number) || numberToIndex.get(number).isEmpty()){
            return -1;
        }

        return numberToIndex.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
