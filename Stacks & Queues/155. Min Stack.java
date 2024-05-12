// Approach 1
// Using two Stacks
// Stack 1 --> for storing elements
// Stack 2 --> minimum element till inserted element

class MinStack {
        Stack<Integer> s1;
        Stack<Integer> minStack;
    public MinStack() {
        s1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
            return;
        }

        int topOfMin = minStack.peek();
        if(topOfMin>val){
            minStack.push(val);
        }else{
            minStack.push(topOfMin);
        }
    }
    
    public void pop() {
        s1.pop();
        minStack.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
// Time : O(1)
// Space : O(2N)



// Approach 2
// Using Pair
// Works same as Approach 1

class Pair{
    int val;
    int minVal;

    Pair(int val, int minVal){
        this.val = val;
        this.minVal = minVal;
    }
}
class MinStack {
    Stack<Pair> st;
    
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.size() == 0){
            st.push(new Pair(val, val));
        }else{
            int min = Math.min(val, st.peek().minVal);
            st.push(new Pair(val, min));
        }
    }
    
    public void pop() { 
       st.pop();
    }
    
    public int top() {
        Pair p = st.peek();
        return p.val;
    }
    
    public int getMin() {
        Pair p = st.peek();
        return p.minVal;
    }
}
// time : O(1)
// Space : O(2N)


// Approach 3
// Using min variable with formula

class MinStack {
    Stack < Long > st = new Stack < Long > ();
    Long mini;

    public MinStack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);
                mini = val;
            } else {
                st.push(val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val;
        }
    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }
}
// Time : O(1)
// Space : O(1)
