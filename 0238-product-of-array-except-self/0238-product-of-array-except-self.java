class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int mul = 1;
        for(int i = 0;i<nums.length;i++){
            left[i] = mul*nums[i];
            System.out.print(left[i] + " ");
            mul = left[i];
        }
        System.out.println();
        mul = 1;
        for(int i = nums.length-1;i>=0;i--){
            right[i] = mul*nums[i];
            System.out.print(right[i] + " ");
            mul = right[i];
        }
        nums[0] = right[1];
        for(int i = 1;i<nums.length-1;i++){
            nums[i] = left[i-1]*right[i+1];
        }
        nums[nums.length-1] = left[nums.length-2];
        return nums;
    }
}