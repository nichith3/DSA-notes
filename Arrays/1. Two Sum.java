// Approach 1
// Brute force
// Time : O(n2)
// Space : O(1)

// Approach 2
// Sorting Array and Using Two pointers
// Time : O(n logn)
// Space : O(n)


import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = nums.clone();

        Arrays.sort(arr);
        int n = nums.length;
        int i=0;
        int j=n-1;

        while(i<=j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                return Search(nums, arr[i], arr[j]);
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }

    public static int[] Search(int[] arr,int a, int b){
        int first = -1;
        int second = -1;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(first==-1 && arr[i]==a){
                first = i;
                continue;
            }

            if(second==-1 && arr[i]==b){
                second = i;
            }
        }

        return new int[]{first, second};
    }
}


// Approach 3
// Using Hashset
// Time : O(n)
// Space : O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            
            int difference = target-nums[i];

            // Search the hashmap for complement, if found, we got our pair
            if(map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }

            map.put(nums[i], i);

        }
        return null;
    }
}
