// Note: if we rotate an array by it size times then we get same array
// k = k % n

// Approach 1
// Brute force
/* 

  for(i=0; i<k; i++){
        temp = nums[n-1];
        for(j=n-1; j>0; j--){
            nums[j] = nums[j-1];
        }
            nums[0] = temp;
  }

*/
// Time : O(n2)
// Space : O(1)


// Approach 2
// Using an extra array

/*

    public void rotate(int[] nums, int k) {
        int temp[] = new int[k];
        int i = 0, j = 0;
        int n = nums.length;
        if (n == 0) {
            return;
        }
        k = k % n;
        if (k > n) {
            return;
        }

        // Storing k elements in temp array
        for (i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (i = 0; i < n - k; i++) {
            nums[n - 1 - i] = nums[n - k - 1 - i];
        }

        // copy k elemnt from temp to orignial array
        for (i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

*/

// Time : O(n)
// Space : O(n)


// Approach 3
// Revising the Arrays

class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if(n==0){
            return;
        }
        k = k %n;
        if(k>n){
            return;
        }

        // Reverse only k elements
        reverse(nums,n-k, n-1);

        // Reverse execept k elements
        reverse(nums, 0, n-k-1);

        // Reverse entire array
        reverse(nums, 0, n-1);
    }
    public static void reverse(int arr[], int s, int e){
        int i=s;
        int j=e;
        int temp=0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
// Time : O(n)
// Space : O(1)
