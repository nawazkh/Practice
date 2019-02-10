class MyStack {
    private Deque<Integer> q;
    
    /** Initialize your data structure here. */
    public MyStack() {
        q = new ArrayDeque<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.addLast(x);
        // call rotate Queue
        for(int i = 0; i < q.size()-1; i++){
            q.addLast(q.removeFirst());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q.size()!=0){
            return q.removeFirst();
        }
        return -1;
    }
    
    /** Get the top element. */
    public int top() {
        return q.peekFirst();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q.size() == 0)
            return true;
        return false;
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