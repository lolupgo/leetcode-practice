class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int len = nums.length;
        int end = len-1;    
        int mid = (start+end)/2;
        while(len>5){
            if(nums[mid] > target){
                //start remains same
                end = mid-1;
                len = (end - start);
                mid = len/2;
            }
            else if(nums[mid]<target){
                //end rmains same
                start = mid+1;
                len = end - start;
                mid = len/2 + start;
            }
            else{
                return mid;
            }
        }
        for(int i = start;i<=end;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;    
    }
}