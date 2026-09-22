class Solution {
    public int[] twoSum(int[] nums, int target) {
        // looking for i, j where nums[i] + nums[j] == target
        // can be rewritten as nums[j] = target - nums[i]
        // hashmap storing values : index to find this nums[j]
        HashMap<Integer, Integer> seenMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (seenMap.containsKey(difference)) {
                return new int[] {seenMap.get(difference), i};
            }
            seenMap.put(nums[i], i);
        }
        return new int[0];
    }
}
