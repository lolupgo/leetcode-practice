class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = magazine.length();
        int len2 = ransomNote.length();

        int freq[]=  new int[150];

        for(int i = 0;i<len1;i++){
            freq[magazine.charAt(i)]++;
        }

        for(int i = 0;i<len2;i++){
            freq[ransomNote.charAt(i)]--;
        }

        for(int i = 0;i<150;i++){
            if(freq[i] < 0){
                return false;
            }
        }
        return true;

    }
}