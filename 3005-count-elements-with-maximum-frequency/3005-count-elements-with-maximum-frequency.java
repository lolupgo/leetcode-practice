class Solution {
    public int maxFrequencyElements(int[] nums) {

        int freq[] = new int[101];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        
        int max = freq[0];
        for(int i = 0;i<101;i++){
            if(max<freq[i]){
                max = freq[i];
            }
        }

        int count = 0;
        for(int i = 0;i<101;i++){
            if(max==freq[i]){
                count++;
            }
        }
        return count*max;
    }
}