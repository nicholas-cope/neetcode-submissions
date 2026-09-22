class Solution {
    public boolean isPalindrome(String s) {
        // could reverse string and check if equivalent to the original
        // two pointer, check if each alphanumeric character corresponds correctly

        int l = 0, r = s.length() - 1;
        while (l < r) {
            // move l pointer to first valid character
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            // move r pointer to first valid char
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            // increment/decrement l and r
            l++;
            r--;
        }
        return true;
    }
}
