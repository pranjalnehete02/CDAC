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


            //positional parameters
            Console.WriteLine(obj.Add(10, 20, 30));
            Console.WriteLine(obj.Add(10, 20));
            Console.WriteLine(obj.Add(10));
            Console.WriteLine(obj.Add());

            //named parameters
            Console.WriteLine(obj.Add(x: 10, y: 20, z: 30));
            Console.WriteLine(obj.Add(z: 30, x: 10, y: 20));
            Console.WriteLine(obj.Add(z: 30, y: 20));
            Console.WriteLine(obj.Add(10, z: 30));
            Console.WriteLine(obj.Add(z: 30, x: 10));


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








