class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a hashset to store unique values
        // add elements from nums to hashset one by one
        // if hashset already contains element, return true
        // else false

        Set<Integer> values = new HashSet();
        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }
        return false;

        // for each element in nums
        // check if there is another equivalent element
        // if yes, return true
        // else false

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
