class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int temp = a;
        for(int i = 0;i<n;i++){
            //System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp+b;
        }
        return a;
    }
}