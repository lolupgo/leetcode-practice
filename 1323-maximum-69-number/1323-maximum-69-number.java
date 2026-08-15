class Solution {
    public int maximum69Number (int num) {
        int n = 0;
        while(num>0){
            n*=10;
            n += num%10;
            num/=10;
        }
        int ans = 0;
        System.out.println(n);
        while(n>0){
            ans*=10;
            if(n%10 == 6){
                ans+=9;
                n/=10;
                break;
            }
            ans+=n%10;
            n/=10;
        }
        System.out.println(n);
        System.out.println(ans);
        while(n>0){
            ans*=10;
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
}