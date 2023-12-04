object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var l: Int = 1;

        for (r <- 1 until nums.length){
            if (nums(r-1) != nums(r)) {
                nums(l) = nums(r);
                l += 1;
            }
        }

        l;
    }
}