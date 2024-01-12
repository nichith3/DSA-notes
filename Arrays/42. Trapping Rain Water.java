class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int left[] = new int[size];
        int right[] = new int[size];
        int total = 0,curr;
        int leftmax=0, rightmax=0;

        for(int i=0; i<size; i++){
            if(height[i]> leftmax){
                leftmax = height[i];
            }
            left[i] = leftmax;
        }

        for(int i=size-1; i>=0; i--){
            if(height[i]> rightmax){
                rightmax = height[i];
            }
            right[i] = rightmax;
        }

        for(int i=0; i<size; i++){
            curr = min(left[i],right[i]) - height[i];
            total = total + curr;
        }
        return total;
    }

    public int min(int a,int b){
        if(a<b){
            return a;
        }
        return b;
    }
}
