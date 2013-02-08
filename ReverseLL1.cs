using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Rotate
{
    public class Node
    {
        public int Value { get; set; }
        public Node Next { get; set; }
    }

    public static class ReverseLL1
    {
        public static Node Reverse(Node start)
        {
            return Reverse(start, start);
        }

        public static Node Reverse(Node start, Node originalStart)
        {
            // base case
            if (start.Next == null)
            {
                return start;
            }

            Node next = start.Next;
            Node reverseStart = Reverse(next);
            next.Next = start;

            if (start == originalStart)
            {
                start.Next = null;
            }

            return reverseStart;
        }

        public static void PrintList(Node start)
        {
            while(start != null)
            {
                Console.Write("{0}-->", start.Value);
                start = start.Next;
            }
        }
    }
}
