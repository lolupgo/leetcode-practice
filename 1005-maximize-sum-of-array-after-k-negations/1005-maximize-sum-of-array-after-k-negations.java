class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length && nums[i] < 0 &&  k > 0){
            nums[i] = -nums[i];
            k--;
            i++;
        }

        if(i>0 && i < nums.length && k%2 != 0 ){
            if(nums[i] < nums[i-1] ){
                nums[i] = -nums[i];
            }
            else{
                nums[i-1] = -nums[i-1];
            }
        }
        else if(k%2 != 0 && i < nums.length){
            nums[i] = -nums[i];
        }

        if(k%2!= 0 && i == nums.length){
            nums[i-1] = -nums[i-1];
        }
        
        int sum = 0;
        for(int j = 0;j<nums.length;j++){
            sum+= nums[j];
        }
        return sum;
    }
}