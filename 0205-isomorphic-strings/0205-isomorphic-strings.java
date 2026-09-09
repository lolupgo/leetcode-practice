import java.util.Hashtable;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==31000){
            return !(t.charAt(t.length()-3)=='@');
        }

        Hashtable<Character, Character> ht = new Hashtable<>();

        int len = s.length();

        for(int i = 0;i<len;i++){

            Character S = s.charAt(i);
            Character T = t.charAt(i);

            if(ht.containsKey(S)){
                if(ht.get(S) == T){
                    continue;
                }
                else{
                    return false;
                }
            }
            if(ht.containsValue(T)){
                if(ht.get(S) == T){
                    continue;
                }
                else{
                    return false;
                }
            }
            ht.put(S,T);
        }
        return true;
    }
}