// Approach 1
// Step 1: find length of two list
// difference their length
// move head of greater list by their difference

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;

        int lenA = 0, lenB = 0;

        // length of list A
        while(temp!=null){
            lenA ++;
            temp = temp.next;
        }

        temp = headB;
        // length of list B
        while(temp!=null){
            lenB ++;
            temp = temp.next;
        }

        int index = 0;
        if(lenA > lenB){
            index = lenA - lenB;
            while(index > 0){
                headA = headA.next;
                index--;
            }
        }else{
            index = lenB - lenA;
            while(index > 0){
                headB = headB.next;
                index--;
            }
        }

        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}

// Time : O(N1 + 2N2)
// Space : O(1)


// Approach 2
// when a or b reaches end point to other's list head

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while(a!=b){

            if(a==null){
                a = headB;
            }else{
                a = a.next;
            }

            if(b==null){
                b = headA;
            }else{
                b = b.next;
            }
        }

        return a;
    }
}

// Time : O(N1+N2)
// Space : O(1)
