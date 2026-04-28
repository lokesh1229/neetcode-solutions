class MyStack {
    Queue<Integer> q;
    int size;

    public MyStack() {
        q = new LinkedList<>();
        size = 0;
    }
    
    public void push(int x) {
        int s = q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            q.add(q.poll());
        }
        size++;
    }
    
    public int pop() {
        if(q.isEmpty()){
            return -1;
        }
        int d = q.peek();
        q.poll();
        size--;
        return d;

    }
    
    public int top() {
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */