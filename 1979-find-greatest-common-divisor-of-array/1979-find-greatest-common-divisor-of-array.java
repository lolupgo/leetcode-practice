class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int temp;

        for(int i = 0;i<nums.length;i++){
            if(min>=nums[i]){
                min = nums[i];
            }
            if(max<=nums[i]){
                max = nums[i];
            }
        }

        while(min>=1){
            temp = max;
            max = min;
            min = temp%min;
        }
        return max;
    }
}