class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force: check each element against every other element to see if they sum to target
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        // create hashmap storing value : index
        // once we find nums[i] where hashmap key == difference,
        // return {hashmap value, i}
        HashMap<Integer, Integer> diffsMap = new HashMap<>();
        int difference;
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (diffsMap.containsKey(difference)) {
                return new int[] {diffsMap.get(difference), i};
            }
            diffsMap.put(nums[i], i);
        }
        return new int[0];
        }
    }

