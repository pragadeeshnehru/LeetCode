class MapSum {
    Map<String,Integer> map ;
    public MapSum() {
       this.map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        this.map.put(key,val);
    }
    
    public int sum(String prefix) {
        Set<String> set= this.map.keySet();
        int count =0;
        for(String s : set) {
            if(s.startsWith(prefix)) count+= this.map.get(s);
        }
        return count;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
