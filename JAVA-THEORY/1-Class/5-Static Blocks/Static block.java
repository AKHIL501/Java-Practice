Static Block In Java

 Used to write logics 
 those logics are executed when class file is loaded
 
 static blocks are used to initialized static variables
 Syntax:-
 
 static{
 //Logics
 }
 
 Example:1
 
 class Test{
 {
 System.out.println("Instance block-1");
 }
 {
 System.out.println("Instance block-2");
 }
 static
 {
 //static block
 System.out.println("static block-1");
 }
 static
 {
 //static block
 System.out.println("static block-2");
 }
 Test()
 {
 System.out.println("0 arg constructor")
 }
  Test(int a)
 {
 System.out.println("1 arg constructor")
 }
 
 public static void main (String[] args)
 {
  System.out.println("Hello World");
  new Test();
  new Test(10);
 }
 }
 
 Example 2:
 
 class Test
 {
 static
 {
 //static block
 System.out.println("static block-1");
 }
 static
 {
 //static block
 System.out.println("static block-2");
 }

 
 public static void main (String[] args)
 {
  
 }
 }
 
 *** upto 1.5 version with out main data is printed in output console.
 from 1.6 main is mandatory
 
 
 ------------------------------------------------------------------------------------
 *****Execute the class with out main method..
 
 class A
 {
 Static 
 {
 System.out.println("A class");
 }
 public static void main (String[] args) throws classNotFoundException
 {
  class.forName("B");
  class.forName("C");
  
 }
 }
 ------------------------------------------------------------------
 class B{
 
  Static 
 {
 System.out.println("B class");
 }
 }
 ---------------------------------------------------------------
 class c{
  Static 
 {
 System.out.println("C class");
 }
 }
 ---------------------------------------------------------------
 
 
 
	 class Test
	 {
	 static  int eid;
	 static
	 {
	 eid=501;
	 }

		static void disp()
		{
		System.out.println(Test.eid);
		}
	 
	 public static void main (String[] args) throws classNotFoundException
	 {
	  Test.disp();
	  
	 }
	 }
 -----------------------------------------------------------------------------------
 
	class Test
	 {
	int a=10;
	static int b=20;
	void m1(int a)
	{
	System.out.println("Instance method");
	}
	static  void m2(String Str)
	{
	System.out.println("Static method");
	}
	Test()
	{
	System.out.println("0 arg con");
	}
	Test(int a)
	{
	System.out.println("1 arg con");
	}
	{
	System.out.println("instance block");
	}
	static{
	System.out.println("static block");
	}
	 public static void main (String[] args) throws classNotFoundException
	 {
	  Test t=new Test();
	  Test t1=new Test(10);
	  t.m1(10);
	  Test.m2("Akhil");
	  
	  
	 }