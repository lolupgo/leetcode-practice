class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int p = 0;
        for(int i = 0;i<len;i++){
            int count = 0;
            char curr = chars[i];
            while(i<len && curr == chars[i]){
                count++;
                i++;
            }
            i--;
            chars[p++] = curr;
            if(count > 1){
                String s = String.valueOf(count);
                for(int j = 0;j<s.length();j++){
                    chars[p++] = s.charAt(j);
                }
            }
        }
        return p;
    }
}