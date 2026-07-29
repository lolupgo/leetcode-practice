class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[150];
        String ans =  "";
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        int j = 0;
        do{
            int max_idx = 0;

            for(int i = 0;i<150;i++){

                if(freq[max_idx] < freq[i] ){
                    max_idx = i;
                }

            }

            while(freq[max_idx]>0){
                ans += (char)max_idx;
                freq[max_idx]--;
            }
            j++;

        }while(j < s.length());

        return ans;


    }
}