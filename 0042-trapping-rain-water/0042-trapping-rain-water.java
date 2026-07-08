class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] current_water = new int[len];

        int left_max = height[0];
        
        for(int i = 1;i<len-1;i++){
            if(left_max<height[i]){
                left_max = height[i];
            }
            current_water[i] = left_max;
        }

        int right_max = height[len-1];

        for(int i = len-2;i>0;i--){
            if(right_max<height[i]){
                right_max = height[i];
            }
            if(current_water[i]>right_max){
                current_water[i] = right_max;
            }

        }

        //fill water
        int ans = 0;
        for(int i = 1; i<len-1;i++){
            int temp = current_water[i] - height[i];
            if(temp>0){
                ans += temp;
            }
        }
        return ans;
    }
}