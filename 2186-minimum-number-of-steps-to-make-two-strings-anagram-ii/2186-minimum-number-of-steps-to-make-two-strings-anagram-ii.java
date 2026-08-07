class Solution {
    public int minSteps(String s, String t) {

        int[] freq1 = new int[150];
        int[] freq2 = new int[150];
        int steps = 0;

        for(int i =0;i<s.length();i++){
            freq1[s.charAt(i)]++;
        }
        for(int i = 0;i<t.length();i++){
            freq2[t.charAt(i)]++;
        }

        for(int i =0 ;i<150;i++){
            steps += Math.abs(freq1[i] - freq2[i]);
        }

        return steps;


    }
}