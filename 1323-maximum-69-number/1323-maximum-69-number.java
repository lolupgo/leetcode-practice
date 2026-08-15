class Solution {
    public int maximum69Number (int num) {
       int[] arr=new int[4]; 
       int j=0;
       int k=0;
       int count=0;
       while(num>0){
        arr[j++]=num%10;
        count++;
        num=num/10;
       }

       for(int i=count-1;i>=0;i--){
        if(arr[i]==6){
            arr[i]=9;
            break;
        }
       }

       int rev=0;
       int idx=count-1;
       while(idx>=0){
        rev=(rev*10)+arr[idx];
        idx--;
       }

       return rev;


    }
}