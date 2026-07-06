class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                while(i >= 0 && s.charAt(i) != ' '){
                    ans++;
                    i--;
                }
                break;
            }
        }
        return ans;
    }
}