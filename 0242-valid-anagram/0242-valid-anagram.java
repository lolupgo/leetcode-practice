class Solution {
    public boolean isAnagram(String s, String t) {

        int freq[] = new int[130];
        int freq2[] = new int[130];

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)]++;
            freq2[t.charAt(i)]++;
        }
        for(int i = 0;i<130;i++){
            if(freq[i]!=freq2[i]){
                return false;
                
            }
        }
        return true;
    }
}