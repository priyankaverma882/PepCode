function twoSum(nums: number[], target: number): number[] {
    const seen = new Map<number, number>();

    for (let idx=0; idx<nums.length; idx++){
        let k = target - nums[idx];
        if (seen.has(k)){
            return [seen.get(k)!, idx];
        }
        seen.set(nums[idx], idx);
    }
    return []
};