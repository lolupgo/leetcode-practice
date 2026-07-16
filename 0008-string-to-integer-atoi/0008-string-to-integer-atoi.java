class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int i = 0;
        int flag = 1;
        int len = s.length();
        while(i<len && s.charAt(i) == ' '){
            i++;
        }
        if(i<len && s.charAt(i) == '-'){
            flag = -1;
            i++;
        }
        else if(i<len && s.charAt(i) == '+'){
            i++;
        }
        while(i<s.length()){
            int temp = (int)s.charAt(i);
            if(ans>2147483647){
                if(flag == 1){
                    return 2147483647;
                }
                else{
                    return -2147483648;
                }
            }
            if(temp<=57 && temp>=48){
                ans*=10;
                ans+= (temp-48); 
            }
            else{
                break;
            }
            i++;
        }
        System.out.print(ans);
        if(ans>2147483647){
            if(flag == 1){
                return 2147483647;
            }
            else{
                return -2147483648;
            }
        }
        ans = ans*flag;
        return (int)ans;
    }
}