using System;
using System.Runtime.InteropServices;

namespace FieldAndProperties
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            //o.i = 123;
            o.setter(1234);

            o.P1 = 1457; //Setter 
            Console.WriteLine(o.P1);    //getter
        }
    }

    public class Class1
    {
        //    private int i;
        //    public void setter(int VALUE)
        //    {
        //        if(VALUE < 100) 
        //            i = VALUE;
        //        else
        //        {
        //            Console.WriteLine("Invalid value");
        //        }
        //    }

        //    public int getter()
        //    {
        //        return i;
        //    }
        //}

        private int p1;
        public int P1
        {
            set
            {
                if (VALUE < 100)
                {
                    p1 = VALUE;
                }
                else
                {
                    return p1;
                }
            }
            get
            {
                return p1;
            }
        }

        private string p2;
        public string P2
        {
            set { 
                p2 = value;
            }
            get
            {
                return p2;
            }
        }
        public string P4 { set; get; }