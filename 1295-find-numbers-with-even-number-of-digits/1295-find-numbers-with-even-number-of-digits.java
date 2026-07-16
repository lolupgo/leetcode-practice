class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            int dig = 0;
            while(nums[i]>0){
                nums[i]/=10;
                dig++;
            }
            if(dig%2 == 0){
                ans++;
            }
        }
        return ans;
    }
}