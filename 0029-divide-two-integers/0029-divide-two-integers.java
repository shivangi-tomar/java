class Solution {
    public int divide(int dividend, int divisor) {
        
        int INT_MAX = Integer.MAX_VALUE;  
        int INT_MIN = Integer.MIN_VALUE;  
        
      
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;  
        }
        
        
        boolean negative = (dividend < 0) ^ (divisor < 0); 
        
        
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        int quotient = 0;
        
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;
            
            
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            absDividend -= temp;
            quotient += multiple;
        }
        
        
        return negative ? -quotient : quotient;
    }
}
