class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int len = arr.length;
        String vow = "aeiouAEIOU";

        int i = 0;
        int j = len-1;
        char temp;
        while(i<=j){
            if(!vow.contains(String.valueOf(arr[i]))){
                i++;
                continue;
            }
            if(!vow.contains(String.valueOf(arr[j]))){
                j--;
                continue;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}