class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int st = 0;
        int stop = len-1;
        int mid = (stop - st)/2 + st;
        char ans = letters[0];

        while(st<=stop){
            mid = (stop - st)/2 + st;
            if(letters[mid] <= target){
                st = mid + 1;
            }
            else if(letters[mid] > target){
                ans = letters[mid];
                stop = mid-1;
            }
        }
        return ans;
    }
}