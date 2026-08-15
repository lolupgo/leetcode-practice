class Solution {
    public String compressedString(String s) {
        int len = s.length();
        String ans = "";

        for(int i = 0;i<len;i++){
            int count = 0;
            char curr = s.charAt(i);
            while(i<len && s.charAt(i) == curr){
                i++;
                count++;
                if(count>=9){
                    break;
                }
            }
            ans+=String.valueOf(count);
            ans+=curr;
            i--;
        }

        return ans;
    }
}