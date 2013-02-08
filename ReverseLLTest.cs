using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Rotate
{
    public static class ReverseLLTest
    {
        public static void Test1()
        {
            Node Node1 = new Node {Value = 1};
            Node Node2 = new Node {Value = 2};
            Node Node3 = new Node {Value = 3};
            Node Node4 = new Node {Value = 4};
            Node Node5 = new Node {Value = 5};
            Node Node6 = new Node {Value = 6};

            Node1.Next = Node2;
            Node2.Next = Node3;
            Node3.Next = Node4;
            Node4.Next = Node5;
            Node5.Next = Node6;

            ReverseLL1.PrintList(Node1);

            Node result = ReverseLL1.Reverse(Node1);

            Console.WriteLine();

            ReverseLL1.PrintList(result);
        }

    }
}
