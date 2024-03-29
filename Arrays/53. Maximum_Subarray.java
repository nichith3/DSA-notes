// Approach 1
// brute force - two loops - O(n2)

// Approach - 2
// Kadane's Algorithm - O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            curr = curr + nums[i];
            if(curr > max){
                max = curr;
            }
            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
}
