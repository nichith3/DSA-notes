class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        if(s.length() == 0 || s == null) return 0;

        for(int i=0; i<s.length(); i++){    // i is the mid point
            extendPalindrome(s, i, i);  // odd length
            extendPalindrome(s, i, i+1);  // even length
        }
        return count;
    }
    public void extendPalindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count ++;   right ++;   left --;
        }
    }
}
