// Use two stacks

// Approach 1
class MyQueue {

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
    public MyQueue() {
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }
        int removed = second.pop();

        while(!second.empty()){
            first.push(second.pop());
        }
        return removed;
        
    }
    
    public int peek() {
        while(!first.empty()){
            second.push(first.pop());
        }
        int peeked = second.peek();

        while(!second.empty()){
            first.push(second.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return first.empty();
    }
}
// Time : O(N)
// Space : O(2N)


// Approach 2
// Input and Output Stack

// Push operation
// Push to stack input

// Pop
// if (output not empty) {
//         output.pop
// } else {
//         input --> output
//         output.pop
// }

// top
// if (output not empty) {
//         output.top
// } else {
//         input --> output
//         output.top
// }

// Time : O(N) but O(1) amortised because only in certain cases it is O(N)
// Space : O(2N)
