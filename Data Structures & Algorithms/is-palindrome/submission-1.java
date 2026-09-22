class Solution {
    public boolean isPalindrome(String s) {
        // reverse the string and check if equivalent original s
       StringBuilder cleanedString = new StringBuilder();
       for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            cleanedString.append(Character.toLowerCase(c));
        }
       }
       return cleanedString.toString().equals(cleanedString.reverse().toString());
    }
}
