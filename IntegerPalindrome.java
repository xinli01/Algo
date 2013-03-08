// this is one solution, another to follow....
public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0)
        {
            return false;
        }
        
        double base = 10;
        double n = 0;        
        double leftIndex;
        double rightIndex;
        
        while(x/Math.pow(base, n) >=1)
        {
            n++;            
        }
        
        // the integer digits are n;
        leftIndex = n;
        rightIndex = 1;
        
        while(leftIndex > rightIndex)
        {
            //get the first number
            int quotient = (int)(x/Math.pow(base, leftIndex-1));            
            
            // get the last number
            if (x%10 != quotient)
            {
                return false;
            } 
            
            x = x/10;
            x = x- quotient * (int)(Math.pow(base, leftIndex-2));
            
            leftIndex-=2;
            rightIndex++;  
        }
        
        return true;        
    }
}