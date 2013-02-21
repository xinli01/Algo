using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProgramTestMain
{
    public class TwoSum
    {
        /// <summary>
        /// this is to find all the pairs in the array that sum up to a number
        /// ex: two sum
        ///    int[] twoSumInput = new int[] {2, 4, 3, 9, 0, 8, 1, 6};
        ///    TwoSum.FindSumPair(twoSumInput, 10);
        ///    results: (2, 8), (1, 9), (6, 4)   
        /// 
        /// </summary>
        /// <param name="input"></param>
        /// <param name="sum"></param>
        /// <returns></returns>
        public static List<KeyValuePair<int, int>> FindSumPair(int[] input, int sum)
        {
            if (input.Length <= 1)
            {
                return null;
            }

            // result list
            var result = new List<KeyValuePair<int, int>>();

            var complementDict = new Dictionary<int, int>();

            for (int i = 0; i < input.Length; i++)
            {
                if (complementDict.ContainsKey(input[i]))
                {
                    result.Add(new KeyValuePair<int, int>(input[i], sum - input[i]));
                }
                else
                {
                    complementDict.Add(sum-input[i], sum-input[i]);
                }
            }

            for(int j=0; j< result.Count; j++)
            {
                Console.WriteLine(string.Format("{0}  {1}", result[j].Key, result[j].Value));
            }

            return result;
        }
    }
}
