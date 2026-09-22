class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

# example:
# input: [1, 2, 3, 4, 5] target = 4
# output: [0, 2]

# 1. brute force: compare every element against every other element to see if they sum to target
# 2. sort the input array, and use two pointers to check distinct pairs O(nlogn)
# 3. nums[i] + nums[j] = target -> nums[j] = target - nums[i]
#    use a hashmap to keep track of complement values for O(1) lookups
#    value:index
#    iterate through nums
#       if target - nums[i] is in set, return i, j
#       otherwise, add target - nums[i] to map

        seenComplements = {}
        
        for i, val in enumerate(nums):
            complement = target - val
            if complement in seenComplements:
                return [seenComplements[complement], i]
            seenComplements[val] = i
        return []
