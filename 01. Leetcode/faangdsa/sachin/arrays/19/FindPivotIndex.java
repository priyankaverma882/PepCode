class Solution {
    public int pivotIndex(int[] nums) {
        int l = 0, r = Arrays.stream(nums).sum();

        for (int idx = 0; idx<nums.length; idx++){
            r-=nums[idx];
            if (l==r){
                return idx;
            }
            l+=nums[idx];
        }
        return -1;
    }
}