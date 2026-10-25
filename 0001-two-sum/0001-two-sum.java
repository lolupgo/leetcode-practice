
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ht = new HashMap<>();
        int ans[] = new int[2];
        int a;
        int b;

        for(int i = 0;i<nums.length;i++){
            a = nums[i];
            b = target-a;
            if(ht.containsKey(b)){
                ans[0] = ht.get(b);
                ans[1] = i;
                return ans;
            }
            ht.put(a,i);
        }
        return ans;
    }
}