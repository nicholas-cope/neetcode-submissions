class Solution {
    public boolean isAnagram(String s, String t) {
        // two hashtables containing frequency of each letter
        // if equivalent, return true
        // else false

        // Set<String> set1 = new HashSet<String>();
        // Set<String> set2 = new HashSet<String>();

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        if (Arrays.equals(sArray, tArray)) {
            return true;
        }
        return false;

    }
}
