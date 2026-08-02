class Solution {
    public int mostFrequentEven(int[] nums) {
        int len = nums.length;
        int freq[] = new int[100001];

        for(int i = 0;i<len;i++){
            if(nums[i]%2 == 0){
                freq[nums[i]]++;
            }
        }
        int max = 0;
        int idx = 0;
        for(int i = 0;i<100001;i++){
            if(freq[i]>max){
                max = freq[i];
                idx = i;
            }
        }
        if(max == 0){
            return -1;
        }
        return idx;

    }
}