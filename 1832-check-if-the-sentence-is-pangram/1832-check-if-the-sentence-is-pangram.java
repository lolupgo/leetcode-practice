class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character> hs = new HashSet<>();

        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(hs.add(s.charAt(i))){
                count++;
                if(count == 26){
                    return true;
                }
            }
        }
        return false;
    }
}