global using Payroll.n1; 
using System.Data;


//The payroll system for adding namespaces from another file

namespace Payroll
{
    public class Employee
    {
        static void Main1()
        {

        }
    }
    public class Department { }
    namespace n1
    {
        public class Class1 { }
    }
}

namespace Classbasics
{
    internal class Program
    {
        static void Main1()
        {
            Console.WriteLine("Hello World !! Kalyani Chaporkar");
        }
        static void Main()
        {
            Class1 obj = new Class1();
            obj.Display();
            obj.Display("Pranjal");


            //string myLongString = @"This is a very
            //    very
            //        very
            //                long string";
            //Console.WriteLine(myLongString);


            //Console.WriteLine(@"Cerebus said ""Darrr! Pret-ty sun-sets""");
            Console.WriteLine("=> String equality:");
            string s1 = "Hello!";
            string s2 = "Yo!";
            Console.WriteLine("s1 = {0}", s1);
            Console.WriteLine("s2 = {0}", s2);
            Console.WriteLine();
            // Test these strings for equality.
            Console.WriteLine("s1 == s2: {0}", s1 == s2);
            Console.WriteLine("s1 == Hello!: {0}", s1 == "Hello!");
            Console.WriteLine("s1 == HELLO!: {0}", s1 == "HELLO!");
            Console.WriteLine("s1 == hello!: {0}", s1 == "hello!");
            Console.WriteLine("s1.Equals(s2): {0}", s1.Equals(s2));
            Console.WriteLine("Yo!.Equals(s2): {0}", "Yo!".Equals(s2));
            Console.WriteLine();


            ////positional parameters
            //Console.WriteLine(obj.Add(10, 20, 30));
            //Console.WriteLine(obj.Add(10, 20));
            //Console.WriteLine(obj.Add(10));
            //Console.WriteLine(obj.Add());

            ////named parameters
            //Console.WriteLine(obj.Add(x: 10, y: 20, z: 30));
            //Console.WriteLine(obj.Add(z: 30, x: 10, y: 20));
            //Console.WriteLine(obj.Add(z: 30, y: 20));
            //Console.WriteLine(obj.Add(10, z: 30));
            //Console.WriteLine(obj.Add(z: 30, x: 10));


        }
    }

    public class Class1 {
        public void Display()
        {
            Console.WriteLine("Display Function Called !!");
        }


        //Function overloading
        public void Display(string s)
        {
            Console.WriteLine("Display parameter Function Called !! : " + s);
        }

        //Function with initializing the paramtere
        public int Add(int x = 0, int y = 0, int z = 0)
        {
            return x + y;
        }

    }

}








