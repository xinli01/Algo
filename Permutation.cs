using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProgramTestMain
{
    public class Permutation
    {
        internal static int count = 0;

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

        private static List<string> PermutationRec(string input, List<int> notUsedList)
        {
            var result = new List<string>();
            
            // base case
            if (notUsedList.Count == 1)
            {
                result.Add(input.Substring(notUsedList[0], 1));
                return result;
            }

            // recursive case
            for (int i = 0; i < notUsedList.Count; i++)
            {
                string sub1 = input.Substring(notUsedList[i], 1);

                //make a new list
                List<int> newList = new List<int>();
                for (int j = 0; j < notUsedList.Count; j++)
                {
                    if (notUsedList[j] != notUsedList[i])
                        newList.Add(notUsedList[j]);
                }                

                var ret = PermutationRec(input, newList);

                // concat
                foreach (string x in ret)
                {
                    result.Add(string.Concat(sub1, x));
                }                
            }

            if (notUsedList.Count == input.Length)
            {
                foreach (string s in result)
                {
                    Console.WriteLine(s);
                    count++;
                }

                Console.WriteLine("total count is {0}", count);
                return null;
            }

            return result;
        }
    }
}
