class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet values = new HashSet();
        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }
        return false;

        // create a hashset to store unique values
        // add elements from nums to hashset one by one
        // if hashset already contains element, return true
        // else false
    }
}
