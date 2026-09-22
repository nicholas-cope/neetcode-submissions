class Solution {
    public boolean isAnagram(String s, String t) {
        // brute force: sort strings and check equality
        if (s.length() != t.length()) {
            return false;
        }

        // char[] sSorted = s.toCharArray();
        // Arrays.sort(sSorted);
        // char[] tSorted = t.toCharArray();
        // Arrays.sort(tSorted);
        // return Arrays.equals(sSorted, tSorted);

        // create a hashmap char : num occurences
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        return sMap.equals(tMap);
    }
}
