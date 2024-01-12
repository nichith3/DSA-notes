/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
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
