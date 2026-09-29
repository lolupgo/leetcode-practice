
class Solution {
    public char repeatedCharacter(String s) {
        HashSet <Character> hs = new HashSet();
        int len = s.length();
        for(int i = 0;i<len;i++){
            if(hs.contains(s.charAt(i))){
                return s.charAt(i);
            }
            hs.add(s.charAt(i));
        }
        return s.charAt(0);
    }
}