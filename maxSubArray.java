public class Solution {
    public int maxSubArray(int[] A) {
        
        // boundary check
        if (A == null) return 0;
        
        int result = 0;
        
        // build a result array
        int[] resultList = new int[A.length]; 
        
        // loop throght original array
        // if in resultArray, previous node exist, check sum of previous node with itself
        // of greater, use that, otherwise, use self
        for (int i=0; i< A.length; i++)
        {
            if (i==0)
            {
                resultList[i] = A[i];
                continue;
            }
            
            resultList[i] = resultList[i-1]+A[i]>A[i] ? resultList[i-1]+A[i] : A[i];
        }
        
        int max = resultList[0];
        
        for (int j=0; j<A.length; j++)
        {
            max = resultList[j]>max ? resultList[j] : max;
        }
        
        return max;
    }
}
