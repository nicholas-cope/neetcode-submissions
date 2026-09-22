class Solution {
    public boolean isPalindrome(String s) {
        // reverse the string and check if equivalent original s

    //    StringBuilder cleanedString = new StringBuilder();
    //    for (char c : s.toCharArray()) {
    //     if (Character.isLetterOrDigit(c)) {
    //         cleanedString.append(Character.toLowerCase(c));
    //     }
    //    }
    //    return cleanedString.toString().equals(cleanedString.reverse().toString());

    int l = 0, r = s.length() - 1;
    while (l < r) {
        while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
            l++;
        }
        while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
            r--;
        }
        if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
            return false;
        }
        l++;
        r--;
    }
    return true;

    }
}
