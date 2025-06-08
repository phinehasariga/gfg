class Solution {
    public boolean isSumString(String s) {
        // code here
                int n = s.length();
        // Try all possible first and second number lengths
        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j < n; j++) {
                if (check(s, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean check(String s, int start, int len1, int len2) {
        String num1Str = s.substring(start, start + len1);
        if (num1Str.length() > 1 && num1Str.charAt(0) == '0') {
            return false;
        }
        long num1;
        try {
            num1 = Long.parseLong(num1Str);
        } catch (NumberFormatException e) {
            return false;
        }
        
        String num2Str = s.substring(start + len1, start + len1 + len2);
        if (num2Str.length() > 1 && num2Str.charAt(0) == '0') {
            return false;
        }
        long num2;
        try {
            num2 = Long.parseLong(num2Str);
        } catch (NumberFormatException e) {
            return false;
        }
        
        int nextStart = start + len1 + len2;
        if (nextStart == s.length()) {
            return false; // need more than two numbers
        }
        
        while (nextStart < s.length()) {
            long sum = num1 + num2;
            String sumStr = Long.toString(sum);
            if (s.startsWith(sumStr, nextStart)) {
                int sumLen = sumStr.length();
                nextStart += sumLen;
                num1 = num2;
                num2 = sum;
                if (nextStart == s.length()) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}