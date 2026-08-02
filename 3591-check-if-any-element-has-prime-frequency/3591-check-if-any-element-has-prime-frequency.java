class Solution {
    public boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[] = new int[101];
        for(int i =0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        for(int i = 0;i<101;i++){
            if(isprime(freq[i])){
                return true;
            }
        }
        return false;
    }
}