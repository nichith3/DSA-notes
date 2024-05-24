// Approach 1

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        ListNode temp = head;
        while(temp!=slow){
            slow = slow.next;
            if(slow == fast){
                temp = temp.next;
            }
        }
        return temp;
    }
}

// Time : O(N*M) --> M is less than length of LL
// Space : O(1)


// Approach 2

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int c=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                c = lengthofCyclce(fast);
                break;
            }
        }
        if(c==0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;

        while(c>0){
            s = s.next;
            c--;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
        }
        return s;

    }

    public int lengthofCyclce(ListNode s){
        ListNode temp = s;
        int length = 0;
        do{
            temp = temp.next;
            length++;
        }while(temp != s);
        return length;
    }
}

// Time : O(2N)
// Space : O(1)


// Approach 3

public class Solution {
    public ListNode detectCycle(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (slow == fast) {
        while (head != slow) {
          head = head.next;
          slow = slow.next;
        }
        return slow;
      }
    }
    return null;
    }
}
// Time : O(N)
// Space : O(1)
