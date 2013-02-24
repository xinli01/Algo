using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProgramTestMain
{
    class Permutation2
    {
        static int count = 0;

        public static void PrintPermutation(string input)
        {
            if (string.IsNullOrWhiteSpace(input))
                return;

            char[] charArr = new char[input.Length];
            for (int i = 0; i < input.Length; i++)
            {
                charArr[i] = input[i];
            }

            PrintPermutation(charArr, 0);
        }

        private static void PrintPermutation(char[] input, int index)
        {
            if (index < 0 || index >= input.Length)
            {
                return;
            }

            // base case
            if (index == input.Length - 1)
            {
                count++;
                Console.Write(string.Format("{0}   ", count));
                Console.WriteLine(input);
            }
            else
            {
                for (int i = index; i < input.Length; i++)
                {
                    char temp;

                    if (index != i)
                    {
                        temp = input[index];
                        input[index] = input[i];
                        input[i] = temp;
                    }

                    PrintPermutation(input, index + 1);

                    if (index != i)
                    {
                        temp = input[index];
                        input[index] = input[i];
                        input[i] = temp;
                    }
                }
            }
        }
    }
}
