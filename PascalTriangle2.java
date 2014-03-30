public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        if(numRows <0) return null;
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i< numRows; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            
            if (i==0)
            {
                temp.add(1);
            }
            else
            {
                ArrayList<Integer> prevResult = result.get(i-1);
                for(int j=0; j<=i;j++)
                {
                    if(j==0 || j==i) {temp.add(1);}
                    else
                    {
                        temp.add(prevResult.get(j-1)+ prevResult.get(j));
                    }
                }
            }
            
            result.add(temp);
        }
        
        return result;
    }
}
