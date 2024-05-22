// Approach 1
// copy elements twice into another array
// for every element iterate whole array to check for greater element
// Space : O(2N)
// Time : O(N2)


// Approach 2
// mimic the array - without copying using --> i % n
// for every element iterate whole array to check for great element
// Space : O(1)
// Time : O(N2)


// Approach 3
// mimic the array - without copying using --> i % n
// Use Stack and iterate from last 
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=(n*2)-1; i>=0; i--){

            // Remove elements that less than current element
            while(!s1.isEmpty() && s1.peek()<=nums[i%n]){
                s1.pop();
            }

            if(i<n){

            // the top of the stack is next greatest element of curr element
                if(!s1.isEmpty()){
                    ans[i] = s1.peek();
                }else{
                    ans[i] = -1;
                }
            }
            s1.push(nums[i%n]);
        }
        return ans;
    }
}
// Space : O(1)
// Time : O(N)
