// eg : push 4, 7, 1
// push 4 : head --> 4 --> null
// push 7 : head --> 7 --> 4 --> null
// push 1 : head --> 1 --> 7 --> 4 --> null

public class Solution {
    static class Stack {
        int length;
        Node head;
        Stack()
        {
            head = null;
            length = 0;
        }

        int getSize()
        {
            return length;
        }

        boolean isEmpty()
        {
            if(length==0){
                return true;
            }
            return false;
        }

        void push(int data)
        {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            length++;
        }

        void pop()
        {
            if(length==0){
                return;
            }
            head = head.next;
            length--;
        }

        int getTop()
        {
            if(length==0){
                return -1;
            }
            return head.data;
        }
    }
}
