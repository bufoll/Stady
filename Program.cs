using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SPO3
{
   static class Funct
    {
        static public bool IsIdent(string s)
        {
            if(!Char.IsLetter(s[0]))
            return false;
            for(int i = 1; i < s.Length; i++)
            {
                if (!Char.IsDigit(s[i]) && !Char.IsLetter(s[i]))
                    return false;
            }
            return true;
        }
        static public int WhatIs(string s)
        {
            return 0;
        }
    } 
    class Read
    {
        StreamReader sr = new StreamReader("SPO.txt");
        public List<String> id = new List<string>();
        public Read()
        {
            string rez = "";
            while (!sr.EndOfStream)
            {
                char symbol = (char)sr.Read();//считываем по символу
                if (symbol != '\n' && symbol != ' ')//если не пробел и не перенос
                {
                    rez += symbol;
                    Console.WriteLine(rez);
                }
                else//если не пробел и не перенос
                {
                    Console.WriteLine(rez);
                    if (Funct.IsIdent(rez))
                        Console.WriteLine("NORMAS");
                    else
                    {
                        Console.WriteLine("Gavno");
                    }
                    rez =null;
                }
            }
         
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Read ob = new Read();
            Console.ReadKey();
        }
    }

}
