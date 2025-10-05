// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;          
                result.append(c);        
            }
        }
        return result.toString();
    }
}