public class Solution {
    
    // here is a better solution
    public int removeElement2(int[] A, int elem) {
        int begin = 0;
        
        for (int i=0; i< A.length; i++)
        {
            if (A[i] != elem)
            {
                if (begin != i)
                {
                    A[begin] = A[i];
                }
                
                begin++;
            }
        }
        
        return begin;
    }
    
    // original solution
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
    
    void swap(int index1, int index2, int[] A)
    {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
