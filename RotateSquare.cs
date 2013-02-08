using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Rotate
{
    public class RotateSquare
    {
        static void Main(string[] args)
        {
            #region Rotate Square
            // initiliaze the square
            //int [,] sqaure = new int[,]
            //                     {
            //                         {1,2,3,4,5,6},
            //                         {7,8,9,10,11,12},
            //                         {13,14,15,16,17,18},
            //                         {19,20,21,22,23,24},
            //                         {25,26,27,28,29,30},
            //                         {31,32,33,34,35,36}
            //                     };


            //// printout the square
            //PrintoutSquare(sqaure);

            //Console.WriteLine("After the rotation");

            //// rotate the square
            //Rotate(sqaure);

            //// printout the result
            //PrintoutSquare(sqaure);

            //Console.WriteLine("Travese square.............");

            //TraverseSquare(sqaure);
            #endregion Rotate Square

            #region ReverseLinkedList
            ReverseLLTest.Test1();

            #endregion ReverseLinkedList

            Console.ReadLine();
        }

        static void Rotate(int[,] square)
        {
            int length = square.GetLength(0);

            int baseIndex = 0;
            int maxIndex = length-1;

            int tempStore;

            for(int layer = 0; layer < length/2; layer++)
            {
                // key 
                for (int j = baseIndex, k=0; j < maxIndex; j++, k++)
                {
                    // save the right to temp
                    tempStore = square[maxIndex-k, maxIndex];

                    // move the top to right
                    square[maxIndex-k, maxIndex] = square[maxIndex, j];

                    // move the left to top
                    square[maxIndex, j] = square[j, baseIndex];

                    // move the bottom to left
                    square[j, baseIndex] = square[baseIndex, maxIndex-k];

                    // move the temp to the bottom
                    square[baseIndex, maxIndex-k] = tempStore;
                }

                baseIndex++;
                maxIndex--;
            }
        }

        static void PrintoutSquare(int[,] square)
        {
            int lengthIndex = square.GetLength(0)-1;

            for(int i= lengthIndex; i>=0; i--)
            {
                for(int j=0; j <=lengthIndex; j++)
                {
                    Console.Write(string.Format("{0},", square[i, j].ToString("d2")));
                }

                Console.Write("\n\r");
            }
        }

        static void TraverseSquare(int[,] square)
        {
            if (square == null)
            {
                return;
            }

            int length = square.GetLength(0);
            int baseIndex = 0;
            int maxIndex = length - 1;

            for (int layer = 0; layer < length/2; layer++)
            {
                // starting from the upleft position
                // top level, from left to right
                for(int i = baseIndex; i < maxIndex; i++)
                {
                    Console.Write(string.Format("{0},{1}  ", maxIndex, i));
                }

                Console.Write("\n\r");

                // right level, from top to bottom
                for (int i = maxIndex; i > baseIndex; i--)
                {
                    Console.Write(string.Format("{0},{1}  ", i, maxIndex));
                }

                Console.Write("\n\r");

                // bottom level, from right to left
                for (int i = maxIndex; i > baseIndex; i--)
                {
                    Console.Write(string.Format("{0},{1}  ", baseIndex, i));
                }

                Console.Write("\n\r");

                // left level, from bottom to top
                for (int i = baseIndex; i < maxIndex; i++)
                {
                    Console.Write(string.Format("{0},{1}  ", baseIndex, i));
                }

                Console.Write("\n\r");

                maxIndex--;
                baseIndex++;
            }
        }
    }
}
