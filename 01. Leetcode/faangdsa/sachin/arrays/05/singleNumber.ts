function singleNumber(nums: number[]): number {
    let a = 0;
    for (let num of nums){
        a ^= num;
    }
    return a;
};