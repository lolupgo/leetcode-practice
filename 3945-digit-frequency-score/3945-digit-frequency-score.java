class Solution {
    public int digitFrequencyScore(int n) {
        int num=n;
        int freq[] = new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        int ans = 0;
        for(int i = 0;i<10;i++){
            ans+= freq[i]*i;
        }
        return ans;
    }
}