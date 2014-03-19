public class Solution {
    
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public int numTrees(int n) {
        
        //base case
        if (n==0 || n==1)
        {
            return 1;
        }
        
        int result = 0;
        
        for(int i=0; i< n; i++)
        {
            Integer v1 = map.get(i);
            if (v1== null)
            {
                v1 = numTrees(i);
                map.put(i, v1);
            }
            
            Integer v2 = map.get(n-1-i);
            if (v2== null)
            {
                v2 = numTrees(n-1-i);
                map.put(n-1-i, v2);
            }
            
            result+= v1 * v2;
        }
        
        return result;
    }
}
