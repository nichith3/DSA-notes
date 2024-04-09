// Approch 1
// Using Stacks - LIFO
// Only Values are changed not Nodes
// Time : O(n)
// Space : O(n)


// Approch 2
// three pointers

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;

        ListNode curr = head;
        ListNode next = head.next;

        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }

        }
        return prev;

    }
}
// Time : O(n)
// Space : O(1)
