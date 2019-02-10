class MyQueue {
    Stack<Integer> mainStack = new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
        mainStack.push(x);
        return;
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        int result = 0;
        Stack<Integer> tempStack = new Stack<>();
        
        while(!mainStack.empty()){
            tempStack.push(mainStack.peek());
            mainStack.pop();
        }
        
        if(!tempStack.empty()){
           result =  tempStack.peek();
            tempStack.pop();
        }
        while(!tempStack.empty()){
            mainStack.push(tempStack.peek());
            tempStack.pop();
        }
        return result;
    }
    
    /** Get the front element. */
    public int peek() {
       int result = 0;
        Stack<Integer> tempStack = new Stack<>();
        
        while(!mainStack.empty()){
            tempStack.push(mainStack.peek());
            mainStack.pop();
        }
        
        if(!tempStack.empty()){
           result =  tempStack.peek();
        }
        while(!tempStack.empty()){
            mainStack.push(tempStack.peek());
            tempStack.pop();
        }
        return result;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(mainStack.empty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */