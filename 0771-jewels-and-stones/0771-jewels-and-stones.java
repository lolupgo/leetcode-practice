class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> lol = new HashSet<>();

        int len1 = jewels.length();
        for(int i = 0;i<len1;i++){
            lol.add(jewels.charAt(i));
        }
        int ans = 0;
        for(int i = 0;i<stones.length();i++){
            if(lol.contains(stones.charAt(i))){
                ans++;
            }
        }

        return ans;
    }
}