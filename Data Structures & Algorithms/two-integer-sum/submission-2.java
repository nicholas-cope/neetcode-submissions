class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        use a hashmap to store value : index of nums array
        iterate through nums, let difference = target - nums[i]
        (difference tells us the value we need from the hashmap)
        if difference in hashmap, return [value at diff key, i]
        else add value index pair to hashmap
        */
        
        HashMap<Integer, Integer> prevMap = new HashMap<>(); // value : index
        int difference;
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (prevMap.containsKey(difference)) {
                return new int[]{prevMap.get(difference), i};
            } else {
                prevMap.put(nums[i], i);
            }
        }
        return new int[] {};


        // int[] pair = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             pair[0] = i;
        //             pair[1] = j;
        //             return pair;
        //         }
        //     }
        // }
        // return pair;
    }
}
