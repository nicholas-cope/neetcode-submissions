class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        check 
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
