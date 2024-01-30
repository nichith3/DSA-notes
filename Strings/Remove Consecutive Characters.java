//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// Approach - 1
// Using char Array
class Solution{
    public String removeConsecutiveCharacter(String S){
        int slen = S.length();
        if(slen <=1){
            return S;
        }
        char[] arr = new char[slen];
        int i=0,j=1;
        arr[0] = S.charAt(0);
        for(i=1; i<slen; i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                arr[j] = S.charAt(i);
                j++;
            }
        }
        String B = new String(arr);
        return B;
    }
}

// Approach - 2
// Using String Builder

/*
class Solution{
    public String removeConsecutiveCharacter(String S){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(S.charAt(0));
        
        for(int i=1;i<S.length();i++){
            if(S.charAt(i) != S.charAt(i-1)){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();

    }
}
*/
