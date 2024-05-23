//  min (maxleft[i] - maxRight[i]) - arr[i]

// Approach 1
// Brute force


class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            int left = leftMax(height, i);
            int right = rightMax(height, i);
            sum += Math.min(left, right) - height[i];
        }
        return sum;
    }
    public int leftMax(int[] a, int index){
        int max = a[index];
        for(int i=index; i>=0; i--){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public int rightMax(int[] a, int index){
        int max = a[index];
        for(int i=index; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}


// Time : O(N)
// Space : O(1)


// Approach 2
// Using prefix, suffix array

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Left max - prefix max Array
        int max=height[0];
        for(int i=0; i<n; i++){
            if(height[i] > max){
                max = height[i];
            }
            prefix[i] = max;
        }

        // Right max - suffix max Array
        max = height[n-1];
        for(int i=n-1; i>=0; i--){
            if(height[i] > max){
                max = height[i];
            }
            suffix[i] = max;
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.min(prefix[i], suffix[i]) - height[i];
        }

        return sum;
    }
}

// Time : O(N)
// Space : O(N)


// Approach 3
// Two pointer

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int sum=0;
        int maxLeft=0, maxRight=0;
        while(left<=right){

            if(height[left] <= height[right]){

                if(maxLeft <= height[left]){
                    maxLeft = height[left];
                }else{
                    sum += maxLeft - height[left];
                }

                left ++;
            }

            else{

                if(maxRight <= height[right]){
                    maxRight = height[right];
                }else{
                    sum += maxRight - height[right];
                }

                right --;
            }
        }
        return sum;
    }
}

// Time : O(N)
// Space : O(1)
