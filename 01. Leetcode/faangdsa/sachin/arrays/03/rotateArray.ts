function rotate(nums: number[], k: number): void {
    k %= nums.length;

    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);
};

function reverse(nums: number[], start: number, end: number){
    while (start<end){
        let temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}