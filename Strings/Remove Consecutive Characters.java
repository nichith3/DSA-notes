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
