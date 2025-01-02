using System;

namespace Constructors
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o1 = new Class1();
            Console.WriteLine(o1.i);

            Class1 o2 = new Class1(20);
            Console.WriteLine(o2.i);

        }
    }
    public class Class1
    {

        public int i;

        public Class1(int i = 10)
        {
            Console.WriteLine("int cons called");
            this.i = i; //this a reference to the current object
        }
    }
}
