// Approach 1
// Using Extra Space - HashSet


// Approach 2
// Two Pointers
// Time : O(n)
// Space : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        int k = 1;
        int n = nums.length;

        while(i<n && j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                k++;
            }
        }
        return k;
    }
}
