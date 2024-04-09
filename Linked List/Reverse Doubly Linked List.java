
// Approach 1
// using Stacks - LIFO
// only values are reversed not nodes
// Time : O(n)
// Space : O(n)


// Approach 2
// two pointers - last node, current node
// Time : O(n)
// Space : O(1)
public class Solution
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        Node last = null;
        Node curr = head;
        if(curr==null || curr.next==null){
            return curr;
        }

        while(curr!=null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            
            curr = curr.prev;
        }

        return last.prev;
    }
}
