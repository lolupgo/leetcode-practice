class Solution {
    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int n[] = new int[len];

        int min = nums[0];
        for(int i = 0;i<len;i++){
            if(min>nums[i]){
                min = nums[i];
            }
            n[i] = min;
        } 

        int ans = -1;
        for(int i = 0;i<len;i++){
            n[i] = nums[i] - n[i];
            if(n[i] > ans){
                ans = n[i];
            }
        }
        if(ans == 0)return -1;
        return ans;
    }
}