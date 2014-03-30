// http://oj.leetcode.com/problems/pascals-triangle/

public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i< numRows; i++)
        {
            ArrayList<Integer> partialResult = generateHelp(i+1);
            result.add(partialResult);
        }
        
        return result;
    }
    
    public ArrayList<Integer> generateHelp(int numRows) {
        if (numRows <= 0) return null;
        if (numRows == 1) 
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            return temp;
        }
        
        ArrayList<Integer> prevResult = generateHelp(numRows-1);
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<numRows; i++)
        {
            if (i==0 || i==numRows-1) 
            {
                result.add(1);
                continue;
            }
            
            result.add(prevResult.get(i-1)+ prevResult.get(i));
        }
        
        return result;
    }
}
