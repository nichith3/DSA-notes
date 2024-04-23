public class Solution extends Queue{
    public void push(int x) {
        Node temp = new Node(x);
        if(front == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public int pop() {
        if(front == null){
            return -1;
        }
        int result = front.data;
        front = front.next;
        return result;
    }
}

// Time : O(1)
// Space : O(1)
