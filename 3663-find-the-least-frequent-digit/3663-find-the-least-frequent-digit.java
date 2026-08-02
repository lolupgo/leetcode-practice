class Solution {
    public int getLeastFrequentDigit(int n) {
        int freq[] = new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }


        int m = -1;
        int min = 99999;
        for(int i = 0;i<10;i++){
            if(freq[i] < min && freq[i] != 0){
                min = freq[i];
                m = i;
            }
        }
        return m;
    }
}