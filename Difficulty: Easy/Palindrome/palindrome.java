class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int original = n;
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if(original == rev){
            return true;
        }
        return false;
    }
}