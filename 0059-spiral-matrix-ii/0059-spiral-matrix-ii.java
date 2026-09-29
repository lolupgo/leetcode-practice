class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int start = 0;
        int stop = n-1;
        int count = 1;
        for(int i = 0;i<n;i++){
            //left to right
            for(int j = start;j<stop;j++){
                ans[i][j] = count++;
            }
            //top to bottom
            for(int j = start;j<=stop;j++){
                ans[j][n-i-1] = count++;
            }

            //right to left
            for(int j = stop-1;j>=start;j--){
                ans[n-i-1][j] = count++;
            }
            //bottom to top
            for(int j = stop-1;j>start;j--){
                ans[j][i] = count++;
            }
            start++;
            stop--;
        }
        return ans;
    }
}