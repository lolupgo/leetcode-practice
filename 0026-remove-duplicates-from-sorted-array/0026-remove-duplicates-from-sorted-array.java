class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int last = nums[0];
        while(i < nums.length){
            if(nums[i] > last){
                nums[j] = nums[i];
                j++;
            }
            last = nums[i];
            i++;
        }
        return j;
    }
}