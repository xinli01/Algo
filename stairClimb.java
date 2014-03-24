public class Solution {
    // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public int climbStairs(int n) {
        
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        
        int start = 3;
        int result = 0;
        int prev2 = 1;
        int prev1 = 2;
        
        while(start <= n)
        {
            result = 0; // reset result
            
            result += prev1;
            result += prev2;
            
            prev2 = prev1;
            prev1 = result;
            
            start++;
        }
        
        return result;
    }
}
