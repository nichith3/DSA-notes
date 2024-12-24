// Approach 1
// Brute force
// Time : O(n2)
// Space : O(1)


// Approach 2
// Extra Array
// Add 0's to start Array, 2's to end Array After traverse of complete array fill the remaining position with 1's
// Time : O(n)
// Space : O(n)


// Approach 3
// Dutch National Flag Algo
// Using pointers (start, mid, end)
// Time : O(n)
// Space : O(1)

class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {

            switch (nums[mid]) {
                case 0:
                    // Swap with start index
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    // Swap with end index
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }

    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
