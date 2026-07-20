import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] right = new int[len];
        int[] left = new int[len];

        Stack<Integer> temp = new Stack<>();

        for(int i = 0;i<len;i++){
            if(temp.isEmpty()){
                left[i] = -1;
                temp.push(i);
            }
            else{
                if(heights[temp.peek()] <  heights[i]){
                    left[i] = temp.peek();
                    temp.push(i);
                }
                else{
                    temp.pop();
                    i--;
                }
            }
        }

        Stack<Integer> temp2 = new Stack<>();

        for(int i = len-1;i>=0;i--){
            if(temp2.isEmpty()){
                right[i] = len;
                temp2.push(i);
            }
            else{
                if(heights[temp2.peek()] <  heights[i]){
                    right[i] = temp2.peek();
                    temp2.push(i);
                }
                else{
                    temp2.pop();
                    i++;
                }
            }
        }
        int max_area = 0;
        for(int i = 0;i<len;i++){
            int area = heights[i] * (right[i] - left[i] - 1);
            if(area > max_area){
                max_area = area;
            }
        }
        return max_area;
    }
}