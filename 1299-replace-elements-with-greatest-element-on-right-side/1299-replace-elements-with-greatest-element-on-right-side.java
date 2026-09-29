class Solution {
    public int[] replaceElements(int[] arr) {
        int rmax = -1;
        int len = arr.length;
        int temp;

        for(int i = len-1;i>=0;i--){
            temp = arr[i];
            arr[i] = rmax;
            if(rmax < temp){
                rmax = temp;
            }
        }
        return arr;
    }
}