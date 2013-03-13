public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if (digits == null)
        {
            return null;
        }
        
        int len = digits.length;
        boolean carryOver = true;
        
        for(int i=0; i<len; i++)
        {
            if (digits[i] != 9)
            {
                carryOver = false;
                break;                
            }            
        }
        
        int newArrayLen = carryOver? len+1 : len;
        
        int[] resultArray = new int[newArrayLen];
        
        int index = 1;
        int carryOverNum = 0;
        int addRes = 0;
        
        while(index <= len)
        {
            int temp = digits[len-index];
            
            if(index ==1)
            {
                addRes = temp+1;
            }
            else
            {
                addRes = temp+carryOverNum;                
            }
            
            resultArray[newArrayLen-index] = addRes%10;
            
            carryOverNum = addRes>=10 ? 1:0;  
            
            if((index == len)&&(carryOver))
            {
                resultArray[0] = 1;                
            }  
            
            index++;
        }
        
        return resultArray;       
    }
}