// Approach 1
// Using Stacks

/** class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s1 = new Stack<>();
        if(head == null){
            return false;
        }
        if(head.next == null){
            return true;
        }
        ListNode temp = head;
        while(temp!=null){
            s1.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp!=null){
            if(temp.val != s1.peek()){
                return false;
            }
            temp = temp.next;
            s1.pop();
        }

        return true;
    }
}
**/

// time : O(2N)
// Space : O(N)


// Approach 2
// find middle
// reverse from middle & make it second head
// compare the first head & second head

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode headsecond = reverseList(mid);
        ListNode reverseHead = headsecond;
        while(head!=null && headsecond != null){
            if(head.val != headsecond.val){
                break;
            }
            head = head.next;
            headsecond = headsecond.next;
        }
        reverseList(reverseHead);
        return head == null || headsecond == null;


    }

    public ListNode middle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

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

// Time : O(N)
// Space : O(1)
