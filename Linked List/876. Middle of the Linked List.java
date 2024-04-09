// Approach 1
// Traversing to (length/2) + 1 nodes
public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count ++;
            temp = temp.next;
        }
        temp = head;
        count = (count/2) + 1;
        for(int i=1; i<count; i++){
            temp = temp.next;
        }

        return temp;
    }
// Time : O(n)
// Space : O(1)


// Approch 2
// Fast and slow pointers
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }

        return s;
    }
}
// Time : O(n)
// Space : O(1)
