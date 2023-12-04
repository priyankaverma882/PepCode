class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            int k = target - nums[i];
            if (seen.containsKey(k)){
                return new int[]{seen.get(k), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}