class MyQueue {

    Stack<Integer> stack1,stack2;
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int x) {
        if(stack1.isEmpty()) stack1.push(x);
        else{
            while(!stack1.isEmpty()) stack2.push(stack1.pop());
            
            stack1.push(x);
            while(!stack2.isEmpty()) stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
        if(!stack1.isEmpty()) return stack1.pop();
        return -1;
    }
    
    public int peek() {
        if(!stack1.isEmpty()) return stack1.peek();
        return -1;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
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
