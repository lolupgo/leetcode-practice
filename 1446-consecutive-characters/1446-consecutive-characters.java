class Solution {
    public int maxPower(String s) {
        int len = s.length();
        char[] sc = s.toCharArray();
        char temp;
        int count;
        int ans = 0;

        for(int i = 0;i<len;i++){
            //System.out.println(sc[i]);
            temp = sc[i];
            count = 0;
            while(i<len && temp == sc[i]){
                count++;
                System.out.println(sc[i] + " "+ count);
                i++;
            }
            i--;
            if(count>ans){
                ans = count;
            }

        }
        return ans;
    }
}