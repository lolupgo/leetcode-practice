class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int read = 0;
        int write = 0;

        while(read<len){
            if(nums[read] != 0){
                nums[write] = nums[read];
                write++;
            }
            read++;
        }
        for(int i = write;i<len;i++){
            nums[i] = 0;
        }
    }
}