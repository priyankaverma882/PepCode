

public class rotateArray {
    public void rotate(int[] nums, int k) {
        int a = nums.length;
        k = k % a; 

        reverse(nums, 0, a-k-1);
        reverse(nums, a-k, a-1);
        reverse(nums, 0, a-1);
    }
    public void reverse(int[] nums, int i, int j){
        while(i<=j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
