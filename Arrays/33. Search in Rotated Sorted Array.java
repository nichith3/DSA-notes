// Approach 1 
// Brute force - Traversing
// Time : O((N*M)*(N + M))
// Space : O(1)


// Approach 2
// Taking Row and Col - Indicate whole row & Col
// Time : O(M*N)
// Space: O(M) + O(N)

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for (int i=0; i<m; i++) {
            if (row[i]) {
                for (int j=0; j<n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        for (int j=0; j<n; j++) {
            if (col[j]) {
                for (int i=0; i<m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    
}





// Approach 3
// Modify Approach 2 
// Instead of taking extra row and col arrays - use it inside the matrix
// Time : O(M*N)
// Space : O(1)

class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        boolean isRow0=false, isCol0=false;
        

        // Mark 1st row & col accordingly:
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0)
                isRow0=true;
        }
        
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0)
                isCol0=true;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        // Mark with 0 from (1,1) to (n-1, m-1):
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }
        

        // Finally mark the 1st col & then 1st row:
        if(isRow0){
            for(int j=0;j<n;j++)
                matrix[0][j]=0;
        }
        
        if(isCol0){
            for(int i=0;i<m;i++)
                matrix[i][0]=0;
        }
    }
}
