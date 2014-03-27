public class Solution {
    public int singleNumber(int[] A) {
        
        // since every bit position are mod by 3 except the only single one
        
        // integer are 32 bit long, so we should have an array of 32 integers
        
        if (A == null || A.length == 0)
        {
            return 0; // should throw exception
        }
        
        //int[] result = new int[32];
        int tempSum = 0;
        int mask = 1;
        int retVal = 0;
        
        for (int i=0; i<32; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                tempSum += (A[j]>>i) & mask; 
            }
            
            tempSum = tempSum %3;
            retVal |= tempSum <<i;
            
            tempSum = 0;
        }
        
        return retVal;
    }
}
