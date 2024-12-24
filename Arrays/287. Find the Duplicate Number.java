// Approach 1
// Brute force
// Time : O(n2)
// Space : O(1)


// Approach 2
// Extra Frequency Array
// Time: O(n)
// Space : O(n)


// Approach 3
// Slow-Fast Pointer
// Imagine as linkedlist cycle
// Time: O(n)
// Space : O(1)

class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0, fast=0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast!=slow);

        slow = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}
