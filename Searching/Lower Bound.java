// lower bound = smallest index such that arr[i] >= x

// Approach 1
// Linear Search


// Approach 2
// Binary Search

public class Solution {
    public static int lowerBound(int []arr, int n, int x) {

        int low = 0;
        int high = n-1;
        
        // because when no element element found then return n
        int ans = n;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }

        return ans;

    }
}
