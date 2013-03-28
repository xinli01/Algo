public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null)
        {
            return false;
        }
        
        int startIndex = 0;
        int endIndex = s.length()-1;
        
        while(startIndex <= endIndex)
        {
            while((s.charAt(startIndex)<'A')&&(s.charAt(startIndex)>'Z')&&
                  (s.charAt(startIndex)<'a')&&(s.charAt(startIndex)>'z')&&(startIndex<=endIndex))
                  {
                      startIndex++;
                  }
                  
            while((s.charAt(endIndex)<'A')&&(s.charAt(endIndex)>'Z')&&
                  (s.charAt(endIndex)<'a')&&(s.charAt(endIndex)>'z')&&(endIndex>=startIndex))
                  {
                      endIndex--;
                  }
                  
            if(Character.toUpperCase(s.charAt(startIndex++))!= Character.toUpperCase(s.charAt(endIndex--)))
            {
                return false;                
            }               
        }
		
        return true;                              
    }
}