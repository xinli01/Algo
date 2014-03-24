public class Solution {
    public int searchInsert(int[] A, int target) {
        
        if (A == null) return 0;
        int endIndex = A.length-1;
        
        if (target > A[endIndex])  return endIndex+1;
        if (target < A[0]) return 0;
        
        int startIndex = 0;
        int midIndex = (startIndex+endIndex)/2;
        
        while (startIndex <= endIndex)
        {
            if (target == A[midIndex])  return midIndex;
            if (target > A[midIndex]) 
            {
                if (startIndex == endIndex -1)
                {
                    return endIndex;
                }
                
                startIndex = midIndex;
            }
            else if (target < A[midIndex])
            {
                if (startIndex == endIndex -1)
                {
                    return midIndex;
                }
                
                endIndex = midIndex;
            }
            
            midIndex = (startIndex+endIndex)/2;
        }
        
        return midIndex;
    }
}
