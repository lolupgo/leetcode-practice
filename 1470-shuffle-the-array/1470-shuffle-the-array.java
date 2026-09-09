class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = 2*n;
        int[] ans = new int[len];

        int j = n;
        int k = 0;
        for(int i = 0;i<len;i++){
            if(i%2 == 0){
                ans[i] = nums[k++];
            }
            else{
                ans[i] = nums[j++];
            }
        }
        return ans;
    }
}