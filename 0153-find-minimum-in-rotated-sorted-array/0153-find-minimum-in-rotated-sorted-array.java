class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int len = end - start;
        while(len>5){
            int mid = len/2 + start;
            //do this
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else if(nums[mid] < nums[end]){
                end = mid;
            }
            len = end-start;
        }
        int min = 6000;
        for(int i = start;i<=end;i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}
