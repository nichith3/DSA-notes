// Approach 1
// Linear Search

// Time : O(n)
// Space : O(1)


// Approch 2
// Binary Search
public int searchInsert(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    if (target < nums[l])
        return 0;
    if (target > nums[r])
        return nums.length;
    while (l <= r) {
        int mid = l + (r - l) / 2;
        if (nums[mid] == target)
            return mid;
        if (nums[mid] < target)
            l = mid + 1;
        else
            r = mid-1;
    }
    return l;
}

// Time : O(logN)
// Space : O(1)
