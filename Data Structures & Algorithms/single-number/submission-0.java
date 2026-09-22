class Solution {
    public int singleNumber(int[] nums) {
        // nested for loop to check each number against all others
        // hashset, iteratively add each value
        // if seen, remove from set
        // return remaining int in set

        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                seen.remove(num);
            } else {
                seen.add(num);
            }
        }
        return seen.iterator().next();
    }
}
