class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        int ans[] = new int[len];
        for(int i = 0;i<len;i++){
            int end = intervals[i][1];
            ans[i] = -1;
            for(int j = 0;j<len;j++){
                if(end <= intervals[j][0] ){
                    if(ans[i] == -1 || intervals[j][0] < intervals[ans[i]][0] ){
                        ans[i] = j;
                    }
                }
            }
        }
        return ans;
    }
}