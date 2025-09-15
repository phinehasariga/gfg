class Solution {
    boolean isPalindrome(String s) {
        // code here
               if (s == null) return false; 

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
        
    }
}