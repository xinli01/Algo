public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null)
        {
            return false;
        }
        
        int len = s.length();
        
        if((len % 2 == 1) || (len == 0))
        {
            return false;
        }
        
        Stack<Character> myStack = new Stack<Character>();
        
        for(int i=0; i<len; i++)
        {
            char c = s.charAt(i);
            
            if ((c=='{') ||(c=='(') ||(c=='['))
            {
                myStack.push(c);
            }
            else 
            {
                char x;
                
                try
                {
                    x = myStack.pop(); 
                }
                catch(Exception e)
                {
                    return false;
                }
                
                if(((c=='}') && (x!='{'))||((c==')') && (x!='('))||((c==']') && (x!='[')))
                {
                    return false;
                }                
            }
        }
        
        return myStack.empty();        
    }
}