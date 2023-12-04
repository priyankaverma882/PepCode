class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer> ();

        for (int num: nums){
            if (seen.contains(num)){
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;
    }
}