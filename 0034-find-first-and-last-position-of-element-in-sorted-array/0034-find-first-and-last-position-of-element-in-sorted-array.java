class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int len = nums.length;
        int end = len-1;    
        int mid = (start+end)/2;
        int[] ans = {-1,-1};

        //target at start
        if(len !=0 && nums[start] == target){
            ans[0] = start;
            start++;
            while(start<=end && nums[start] == target){
                start++;
            }
            ans[1] = --start;
            return ans;
        }

        //binary search
        while(len>10){
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
                //mid tai target hai
                start = mid - 5;
                end = mid + 5;
                break;
            }
        }
        for(int i = start;i<=end;i++){
            if(nums[i] == target){
                ans[0] = i;
                i++;
                while(i<nums.length && nums[i] == target){
                    i++;
                }
                ans[1] = --i;
                break;
            }
        }
        if(ans[0] == start){
            //piche v ho skde hai
            //age tn check krle num length tk
            while(start > -1 && nums[start] == target){
                start--;
            }
            ans[0] = ++start;
        }
        return ans;
    }
}