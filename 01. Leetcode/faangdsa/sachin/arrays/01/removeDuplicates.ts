function removeDuplicates(nums: number[]): number {
    let l = 1;

    for (let r=1; r<nums.length; r++){
        if (nums[r-1] != nums[r]){
            nums[l] = nums[r];
            l++;
        }
    }
    return l;
};