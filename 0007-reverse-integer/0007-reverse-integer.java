class Solution {
    public int reverse(int x) {
        int flag = 1;
        long ans = 0;
        if(x<0){
            x = x*(-1);
            flag = -1;
        }
        while(x>0){
            ans=ans*10;
            ans+=x%10;
            x = x/10;
            if(ans>2147483647){
                return 0;
            }
        }
        ans = ans*flag;
        
        return (int)ans;
    }
}