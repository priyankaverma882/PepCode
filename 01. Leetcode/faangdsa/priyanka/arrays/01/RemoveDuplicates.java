class Solution {
    public  static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int prev = 0;
        int next = 1;
        int[] resultArray = new int[length];
        int k = 0;

        for(int i = 0 ; i < length-1; i++){
            if(nums[prev] != nums[next]){
                resultArray[k] = nums[prev];
                System.out.println(resultArray[k] + "res");
                k++;
                System.out.println(k+"k");
            }
            prev++;
            next++;
        }
        resultArray[k] = nums[length-1];
        System.out.println(resultArray[4] + "res4");
        System.out.println("nums"+nums[length-1]);
        System.out.println(k+"k");
        k = k+1;

        for(int i = 0 ; i < k; i++){
            nums[i]= resultArray[i];
        }
        return k;
    }

    public static void main(String[] args)
    {
        int nums[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
 
        // removeDuplicates() returns new size of array
        int n = removeDuplicates(nums);

        System.out.println("new length:"+ n);
 
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.println(nums[i] + " ");
    }
}