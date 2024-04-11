// Approach 1
// Two Queues

class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int popped = q1.remove();
        while(q2.size()!=0){
            q1.add(q2.remove());
        }
        return popped;
    }
    
    public int top() {
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int popped = q1.remove();
        q2.add(popped);
        while(q2.size()!=0){
            q1.add(q2.remove());
        }
        return popped;
        
    }
    
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        return false;
    }
}

// Time : 
// O(n) for pop and top operations
// O(1) for push and empty operations
// Space : O(n) for storing elements


// Approach 2
// One Queue
class MyStack {
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

// Time :
// O(n) for push operation
// O(1) for pop, top and empty operations
// Space : O(n) for storing elements
