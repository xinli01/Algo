public int longestConsecutive(int[] num) {
        
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> checked = new ArrayList<Integer>();
        
        int max = 0;
                
        for(int i =0; i< num.length; i++)
        {    
            numMap.put(new Integer(num[i]), new Integer(i));
            checked.add(i, 0);
        }        
        
        for(int j=0; j < num.length; j++)
        {
            if (checked.get(new Integer(j)) == 1)
            {
               continue;
            }
            
            checked.set(new Integer(j), 1);
            
            int tempDown = num[j] ;
            int count = 0;
            
            while (numMap.containsKey(--tempDown))
            {
                checked.set(numMap.get(tempDown), 1);                
                count++;                
            }
            
            int tempUp = num[j];
            
            
            while (numMap.containsKey(++tempUp))
            {
                checked.set(numMap.get(tempUp), 1);                 
                count++;               
            }
                            
            max = count+1 > max ? count+1 : max;
        }
        
        return max;  
    }