class Solution {
    public int hIndex(int[] citations) {
        int ans = -1;
        int temp = -1;
        for(int i = 0;i<1000;i++){
            temp = 0;
            for(int j = 0;j<citations.length;j++){
                if(i<=citations[j]){
                    temp++;
                }
                if(temp>i){
                    ans = i;
                    break;
                }
            }
            if(i == temp){
                return temp;
            }
        }
        return ans;
    }
}