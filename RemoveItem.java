public class Solution {
    
    void swap(int index1, int index2, int[] A)
    {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
    
    public int removeElement(int[] A, int elem) {
        
        // boundary checking
        if (A == null || A.length == 0)
        {
            return 0;
        }
        
        int head = 0;
        int tail = A.length -1;
        
        while (head < tail)
        {
            while(head < A.length && A[head] != elem)
            {
                head++;
            }
            
            while(tail >=0 && A[tail] == elem)
            {
                tail--;
            }
            
            if (head < tail)
            {
                swap(head, tail, A);
            }
        }
        
        int index=0;
        
        for(index= 0; index < A.length; index++)
        {
            if (A[index] == elem)
            {
                break;
            }
        }
        
        return index;
    }
}
