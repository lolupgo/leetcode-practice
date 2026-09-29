class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = t.length();
        int len2 = s.length();

        if(len2 == 0)return true;
        if(len2>len)return false;

        int i = 0;
        int j = 0;

        while(i<len){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }


            if(j >= len2)return true;
            i++;
        }

        return false;
    }
}