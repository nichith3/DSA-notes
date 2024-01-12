/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k <=0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while(last.next!=null){
            length ++;
            last = last.next;
        }
        last.next = head;
        int rotations = k%length;
        int skip = length - rotations;
        ListNode newlast = head;
        for(int i=0; i<skip-1; i++){
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
    }
}
