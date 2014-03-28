public class Solution {
    public int removeDuplicates(int[] A) {
        
        if (A.length <=1)
        {
            return A.length;
        }
        
        int j =0;
        int index = 0;
        
        for(index= 0; index<= A.length; index++)
        {
            if(j >A.length-1)
            {
                break;
            }
            
            if (index != j && A[index] != A[j])
            {
                A[index] = A[j];
            }
            
            while(j < A.length && A[j] == A[index])
            {
                j++;
            }
        }
        
        return index;
    }
}
