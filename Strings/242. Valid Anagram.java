// Approach 1
// Convert the strings to char Arrays & sort them
/*      char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
*/

// Approach 2
// Ascii value of character - 'a'
// a - a = 0 index
// k - a = 10 index
// total array index 26
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
}
