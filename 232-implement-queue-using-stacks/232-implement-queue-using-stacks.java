class MyQueue {
    Stack<Integer> main;
    Stack<Integer> helper;
    int size;
    
    public MyQueue() {
            this.main = new Stack <>();
            this.helper = new Stack <>();

        
        
    }
    
    public void push(int x) {
         if(main.size()==0){
            main.push(x);
        }
        else
        {
            while(main.size()>0){
                helper.push(main.pop());
            }
            
        main.push(x);
            
        while(helper.size()>0)
        {
            main.push(helper.pop());
        } 
        } 
        size++;
    }
    
    public int pop() {
        size--;
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.empty())
            return true;
        
        return false;
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