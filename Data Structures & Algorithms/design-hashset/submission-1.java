class MyHashSet {

    List<Integer> list; 

    public MyHashSet() {
        list = new ArrayList<>(); 
    }
    
    public void add(int key) {
        boolean flag = false; 
        for(int n : list) {
            if(n == key) flag = true; 
        }
        if(!flag) list.add(key); 
    }
    
    public void remove(int key) {
        if(this.contains(key)){
            int pos = 0; 
            for(int i = 0; i<list.size(); i++){
                if(list.get(i) == key) pos = i; 
            }
            list.remove(pos); 
        }
    }
    
    public boolean contains(int key) {
        for(int n : list) {
            if(n == key) return true; 
        }
        return false; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */