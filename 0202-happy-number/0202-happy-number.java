class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        do{
            sum=0;
            while(n>0){
                sum = sum + (n%10)*(n%10);
                n/=10;
            }
            n= sum;
        }while(sum>=9);
        if(n == 1 || n ==7){
            return true;
        }
        return false; 
    }
}