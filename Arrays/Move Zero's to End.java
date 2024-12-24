// Approach 2
// Brute force
// Time : O(n2)
// Space : O(1)

// Approach 2
// Using extra Array
// Time : O(n)
// Space : O(n)


// Approach 3
// Two pointers
// Time : O(n)
// Space : O(1)

public static int[] moveZeros(int n, int []a) {

      int i=0,j=0;
      while(i<n && j<n){
        
          if(a[i]==0 && a[j]!=0){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
          }
        
          if(a[i]!=0){
              i++;
          }
          j++;
      }
      return a;
}


