

public class Singlenumber {
    public int singleNumber(int[] nums) {
        return xor(nums,0,0);
    }

    public int xor(int[] nums, int index, int xor){
        if(index >= nums.length) return xor;
        xor ^= nums[index];
        return xor(nums,index+1,xor);
    }
}
