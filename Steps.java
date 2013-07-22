public class Solution {
    
    public static HashMap<Integer, Long> steps = new HashMap<Integer, Long>();  
    
    public long climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        // base case
        if (n < 0) 
        {            
            return 0;         
        }
        
        if (n == 1)
        {
            steps.put(new Integer(n), new Long(1));
            return 1;
        }
        
        if (n == 2) 
        {
            steps.put(new Integer(n), new Long(2));
            return 2;        
        }
        
        // recrusive part
        long temp1;
        long temp2;
        
        if (!steps.containsKey(n-1))
        {
            temp1 = climbStairs(n-1);
            steps.put(new Integer(n-1), temp1);
        }
        else
        {
            temp1 = steps.get(new Integer(n-1));
        }
            
        if (!steps.containsKey(n-2))
        {
            temp2 = climbStairs(n-2);
            steps.put(new Integer(n-2), temp2);
        }
        else
        {
            temp2 = steps.get(new Integer(n-2));
        }
        
        
        long sum = temp1 + temp2;
        if (!steps.containsKey(n))
            steps.put(new Integer(n), sum);
        
        return sum;           
    }
}