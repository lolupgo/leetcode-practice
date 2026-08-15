class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];

        int i = 0;
        int j = len-1;
        int p = len-1;
        while(p>=0){
            int sq1 = nums[i]*nums[i];
            int sq2 = nums[j]*nums[j];
            if(sq1>=sq2){
                ans[p--] = sq1;
                i++;
            }
            else{
                ans[p--] = sq2;
                j--;
            }
        }
        return ans; 
    }
}