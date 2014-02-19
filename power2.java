public class Solution {
    public double pow(double x, int n) {
        
        double result = 1;
        
        if (n == 0)  return result;
        
        boolean isExpNegative = n<0;
        
        n = isExpNegative ? 0-n : n;
        
        while(n > 0)
        {
            if ((n & 1) >0)
            {
                result *= x;
            }
            
            n = n>>1;
            x *= x;
        }
        
        return isExpNegative? 1/result : result;
    }
}
