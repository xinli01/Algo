public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0)
        {
            return false;
        }
        
        int reversedNum = reverse(x);
        
        if (reversedNum == x)
        {
            return true;
        }
        
        return false;
    }
    
    private int reverse(int number)
    {
        int result = 0;
        
        while(number >0)
        {
            int remainder = number%10;
            result = result*10 + remainder;
            number/= 10;            
        }
        
        return result;        
    }
}