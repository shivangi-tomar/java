class Solution {
    
    public int fib(int n) { 
        return Helper(n);
    }


    public int Helper(int n){
        //base lagaya h
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return Helper(n-1) + Helper(n-2);
    }
}