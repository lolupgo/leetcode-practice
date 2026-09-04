class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++){
            int len = words[i].length();
            boolean is = true;
            for(int j = 0;j<len/2;j++){
                if(words[i].charAt(j) != words[i].charAt(len-j-1)){
                    is =false;
                    break;
                }
            }
            if(is){
                return words[i];
            }
        }
        return "";
    }
}