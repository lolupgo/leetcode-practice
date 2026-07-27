class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int sec_max = 0;
        while(n>0){
            if(n%10 >= max){
                sec_max = max;
                max = n%10;
            }
            if(n%10 >= sec_max && n%10<max){
                sec_max = n%10;
            }
            n/=10;
        }
        return max*sec_max;
    }
}