// Approach 1
// Sort the Array
// Time : O(n logn)
// Space : O(1)

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n = arr.size();
        if (m == 0 || n == 0) return 0;
        
        if (n < m) return -1;
    
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=m-1;
        while(j<n){
            int diff = arr.get(j)-arr.get(i);
            if(diff < min){
                min = diff;
            }
            i++;
            j++;
        }
        
        return min;
    }
}
