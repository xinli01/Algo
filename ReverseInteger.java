public class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        
        if (isNegative)
        {
            x = 0-x;
        }
        
        int divider = 10;
        
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        
        while (x >= 1)
        {
            int remainder = x % divider;
            resultList.add(remainder);
            x = x / divider;
        }
        
        int result = 0;
        int multiplier = 1;
        
        // compose the reverse 
        for(int i=resultList.size() -1; i>=0; i--)
        {
            result += resultList.get(i) * multiplier;
            multiplier*=10;
        }
        
        return isNegative? 0-result : result;
     }
}
