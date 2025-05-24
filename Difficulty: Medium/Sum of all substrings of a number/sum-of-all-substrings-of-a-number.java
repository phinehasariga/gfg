class Solution {
    public static int sumSubstrings(String s) {
        // code here
                int n = s.length();
        long result = 0;
        long prev = 0;
        int mod = 1000000007; // if you want to handle large numbers or if specified

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            prev = prev * 10 + (long) digit * (i + 1);
            result += prev;
        }

        return (int) result;
        
    }
}