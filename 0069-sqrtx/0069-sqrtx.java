class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int len = end - start;
        int mid = len/2 + start;
        while(len > 5){
            long sq = (long)mid*mid;
            //do this
            if(sq > x){
                //start remains same
                end = mid - 1;
                len = end-start;
                mid = len/2 + start;
            }
            else if(sq<x){
                start = mid + 1;
                len = end-start;
                mid = len/2 + start;
            }
            else{
                return mid;
            }
            
        }
        for(int i = start;i<=end+1;i++){
            if(i*i > x){
                return i-1;
            }
        }
        return start;
    }
}