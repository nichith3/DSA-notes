// Approach 1
// Brute force 
// Time : O(N2)
// Space : O(N)


// Approach 2
// Pattern : Next Greatest Element
public class Solution {
    public int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] G = new int[n];
        Stack<Integer> s1 = new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!s1.isEmpty() && s1.peek()>=A[i]){
                s1.pop();
            }
            if(!s1.isEmpty()){
                G[i] = s1.peek();
            }else{
                G[i] = -1;
            }
            s1.push(A[i]);
        }
        return G;
    }
}

// Time : O(N)
// Space : O(N)
