public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n==0)
        {
            return 1;
        }
        if (n==1)
        {
            return x;
        }
        
        int m = n>0 ? n : 0-n;
        double res = 1;        
        
        if (m%2 == 1)
        {
            res*= x;
            res*= pow(x, m-1);            
        }
        else
        {
            double temp = pow(x, m/2);
            res*= Math.pow(temp, 2);
        }
        
        return n>0 ? res : 1/res;          
    }
}