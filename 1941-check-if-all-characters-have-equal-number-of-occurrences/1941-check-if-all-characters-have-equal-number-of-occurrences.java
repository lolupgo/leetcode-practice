class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        int len = s.length();

        for(int i = 0;i<len;i++){
            freq[s.charAt(i) - 97]++;
        }

        int temp = 0;
        for(int i = 0;i<26;i++){
            if(freq[i] == 0){
                continue;
            }
            temp = i;
            break;
        }
        System.out.print(freq[temp]);
        int check = freq[temp];
        for(int i = temp;i<26;i++){
            if(freq[i] == 0){
                continue;
            }
            if(check != freq[i]){
                return false;
            }
        }
        return true;

    }
}