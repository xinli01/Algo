using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProgramTestMain
{
    public class Permutation
    {
        // entry
        public static void PrintPermutation(string input)
        {
            List<int> NotUsedIndexList = new List<int>();
            for (int i=0; i< input.Length; i++)
            {
                NotUsedIndexList.Add(i);
            }
            
            PermutationRec(input, NotUsedIndexList);

            return;
        }

        private static string PermutationRec(string input, List<int> notUsedList)
        {
            string result = null;
            
            // base case
            if (notUsedList.Count == 1)
            {
                return input.Substring(notUsedList[0], 1);
            }

            // recursive case
            for (int i = 0; i < notUsedList.Count; i++)
            {
                string sub1 = input.Substring(notUsedList[i], 1);

                //make a new list
                List<int> newList = new List<int>();
                for (int j = 0; j < notUsedList.Count; j++)
                {
                    if (j != notUsedList[i])
                        newList.Add(j);
                }                

                string ret = PermutationRec(input, newList);

                // concat
                result = string.Concat(sub1, ret);

                if (notUsedList.Count == input.Length)
                {
                    Console.WriteLine(result);
                    return null;
                }

                return result;
            }

            return result;
        }
    }
}
