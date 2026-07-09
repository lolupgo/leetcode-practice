class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1);
        int arrsum = 0;
        for(int i = 0;i<n;i++){
            arrsum+=nums[i];
        }
        int ans = sum/2 - arrsum;

        return ans;
    }
}