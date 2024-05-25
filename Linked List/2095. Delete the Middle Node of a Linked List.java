// Approch 1
// Step 1 - get length
// go to till (length/2) - 1 and remove next node


class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        int length = 0;

        while(temp!=null){
            temp = temp.next;
            length ++;
        }

        temp = head;
        for(int i=0; i<length/2-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

// Time : O(N+N/2)
// Space : O(1)


// Approach 2
// Start slow pointer one step back then normally 
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next==null){
            return null;
        }

        ListNode prev = new ListNode(0);
        prev.next = head;

        ListNode slow = prev;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
        }

        slow.next = slow.next.next;
        return head;
    }
}
// Time : O(N)
// Space : O(1)
