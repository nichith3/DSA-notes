// Approach 1
// Brute force

// Replacing values
// take array - first store odd value & then store even value
// after that change the ll values to values in the array

// Time : O(N)
// Space : O(N)


// Approach 2

class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head, even=head.next;
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
    return head;
    }
}

// Time : O(N)
// Space : O(1)
