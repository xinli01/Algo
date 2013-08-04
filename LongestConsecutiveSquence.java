// Start typing your C/C++ solution below
        // DO NOT write int main() function
        //HashMap<int, int> map = new HashMap<int, int>();
        unordered_map<int, int> map = new unordered_map<int, int>();
        
        foreach(int x in num)
        {
            map[num[i]] = i;
        }
        
        //HashMap<int, int> countMapDown = new HashMap<int, int>(num.Count);
        //HashMap<int, int> countMapUp = new HashMap<int, int>(num.Count);
        unordered_map<int, int> countMapDown = new unordered_map<int, int>(num.Count);
        unordered_map<int, int> countMapUp = new unordered_map<int, int>(num.Count);
        
        int max = 0;
        
        for(int j=0; j < num.Count; j++)
        {
            int tempDown = num[j] ;
            int downCount = 0;
            
            while (map.containsKey(tempDown))
            {
                if(countMapDown.ContainsKey(tempDown)
                {
                    downCount = downCount + countMapDown[tempDown];
                    break;
                }
                
                downCount++;
                tempDown--;
            }
            
            CountMapDown[num[j]] = downCount;
            
            int tempUp = num[j];
            int upCount = 0;
            
            while (map.containsKey(tempUp))
            {
                if(countMapUp.ContainsKey(tempUp))
                {
                    upCount = upCount + countMapUp[tempUp];
                    break;
                }
                
                upCount++;
                tempUp++;
            }
            
            CountMapUp[num[j]] = upCount;
            
            int totalLength = downCount + upCount +1; 
            
            if (totalLength > max)
            {
                max = totalLength;
            }
            
        }
        
        return max;       