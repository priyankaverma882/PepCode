import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == prev){
                return true;
            }
            else{
                prev = nums[i];
            }
        }
        return false;
    }
}
