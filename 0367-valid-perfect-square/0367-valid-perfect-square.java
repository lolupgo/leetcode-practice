class Solution {
    public boolean isPerfectSquare(int num) {

        int st = 1;
        int stop = num;
        int mid;
        long sq;

        int len = stop - st;

        while(len > 5){
            len = stop - st;
            mid = len/2 + st;
            sq = (long)mid*mid;

            if(sq > num){
                //go back
                stop = mid-1;
            }
            else if(sq < num){
                st = mid+1;
            }
            else{
                return true;
            }
        }
        for(int i = st;i<=stop;i++){
            if(i*i == num)return true;
        }
        return false;

    }
}