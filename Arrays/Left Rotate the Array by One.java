// Appoach 1
// Using another array


// Approach 2
// Using temp variable
static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int i=0;
        int temp=arr[0];
        for(i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
        return arr;
}
