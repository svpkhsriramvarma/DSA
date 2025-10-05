class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (min > val)
            min = val;
        list.add(val);
    }
    
    public void pop() {
        if (list.size() == 0)
            return;
        int removed = list.remove(list.size() - 1);
        if (removed == min) {
            min = Integer.MAX_VALUE;
            for (int x : list)
                if (x < min)
                    min = x;
        }
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return min;
    }
}
