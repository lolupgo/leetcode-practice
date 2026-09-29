class Solution {
    
    public int maxArea(int[] h) {
        int max = 0;
        int curr = 0;
        int start = 0;
        int stop = h.length-1;
        int distance;
        int min;
        while(start<stop){
            //calculate current distance
            distance = stop-start;

            //index of the minimum one 
            //to shift that one 
            if(h[start]<h[stop]){
                min = start;
                start++;
            }
            else{
                min = stop;
                //braber hoye tn stop vadu
                stop--;
            }

            //calculate current water
            curr = distance * h[min];

            //check if max
            if(curr>max){
                max = curr;
            }
        }
        return max;
    }
}