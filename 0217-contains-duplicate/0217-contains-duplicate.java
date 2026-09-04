class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ls = new HashSet<>();

        int len = nums.length;
        for(int i = 0;i<len;i++){
            if(ls.add(nums[i])){
                continue;
            }
            return true;
        }

        return false;
    }
}