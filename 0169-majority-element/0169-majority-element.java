class Solution {
    public int majorityElement(int[] nums) {
        int len  = nums.length;
        int count = 0;
        int cand = nums[0];

        for(int i = 0;i<len;i++){
            if(cand == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count <= 0){
                cand = nums[i];
                count = 1;
            }
        }
        return cand;
    }
}