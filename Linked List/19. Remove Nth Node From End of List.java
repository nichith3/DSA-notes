// Approach 1
// Brute force

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }

        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length ++;
            temp = temp.next;
        }

        if(length == n){
            head = head.next;
            return head;
        }

        int res = length - n;
        temp = head;
        while(temp !=null){
            res --;
            
            if(res==0){
                break;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

// Time : O(2N)
// Space : O(1)


// Approach 2
// Fast and slow pointer
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        // if nth node is the length of LL
        if(fast==null){
            return head.next;
        }

        // slow will be at length - n
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
// Time : O(N)
// Space : O(1)
