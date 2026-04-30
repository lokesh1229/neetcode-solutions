class MinStack {

    private Stack<Integer> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : st){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
