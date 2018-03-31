	Parent class elements are 5 types:-
		1.Parent class variables
		2.Parent class methods
		3.Parent class constructors
		4.parent class instance block
		5.parent class static block
		
		
		1.Parent class variables
			
					Example 1:-
								 class Parent{
								 int a=10;
								 int b=20;
								 }
								 class Child extends Parent
								 {
								 int a=100;
								 int b=200;
								 void add(int a, int b)
								 {
								 System.out.println(a+b);
								 System.out.println(this.a+this.b);
								 System.out.println(super.a+super.b);
								 
								 public static void main (String args[])
								 {
								 new Child().add(1000,2000);
								 }
								 }
								 }
								 
	-----------------------------------------------------------------------------------
		2.Parent class methods
		
					Example 2:-
								 class Parent{
								void m1(){
								System.out.parentln("Parent m1 method");
								}
								 }
								 class Child extends Parent
								 {
								  void m1()
								 {
								 System.out.println("Child m1 method");
								 }
								 void m2()
								 {
								 this.m1();//  child m1 is executed
								super.m1();// parent m1 is executed
								 }
								 public static void main (String args[])
								 {
									new Child.m2();
								 }
								 }
								 }
	-----------------------------------------------------------------------------------
	
		3.Parent(SUPER) class constructor
		
		Example 1:
		
		class Parent(){
			parent()
			{
			System.out.println("Parent class constructor"); //1
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			this(10)
			System.out.println("Child class constructor");//3
			}
			Child(int a)
			{
			super();
			System.out.println("Child class 1-arg constructor");//2
			}
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
	-------------------------------------------------------------------------------------

		Example 2:
		
		class Parent(){
			parent()
			{
			System.out.println("Parent class constructor"); //1
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			this.(10);
			System.out.println("Child class constructor");//3
			}
			Child(int a)
			{
			
			System.out.println("Child class 1-arg constructor");//2
			super(); //error call to super must be first statement
			}
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		
		-------------------------------------------------------------------------------------

		Example 3:
		
		class Parent(){
			parent()
			{
			System.out.println("Parent class constructor"); //1
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			this.(10);
			super(); //error call to super must be first statement both at a time not posible
			System.out.println("Child class constructor");//3
			}
			Child(int a)
			{
			
			System.out.println("Child class 1-arg constructor");//2
			
			}
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		
		-------------------------------------------------------------------------------------

		Example 4:
		
		class Parent(){
			parent()
			{
			System.out.println("Parent class constructor"); 
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			super(); 
			System.out.println("Child class constructor");
			}
			
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		
		-------------------------------------------------------------------------------------

		Example 5:
		
		class Parent(){
			
		}
		Class Child extends Parent()
		{
			Child()
			{
			super(); // Generates 0-arg constructor.
			System.out.println("Child class constructor");
			}
				public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		
		-------------------------------------------------------------------------------------

		Example 6:
		
		class Parent(){
			Parent(int a)
			{
			
			System.out.println("Child class 1-arg constructor");
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			super(10); 
			System.out.println("Child class constructor");
			}
			
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		-------------------------------------------------------------------------------------

		Example 7:
		
		class Parent(){
			Parent(int a)
			{
			
			System.out.println("Parent  class  constructor");
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			super(); // Generates error because there is no 0-arg constructor.
			System.out.println("Child class constructor");
			}
			
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		-------------------------------------------------------------------------------------

		Example 8:
		
		class Parent(){
			Parent()
			{
			
			System.out.println("Parent  class 0-arg constructor");
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			//super();
			System.out.println("Child class constructor");
			}
			
			public static void main (String args[])
				{
				new Child();
				}
			
		}
		
		//complier generates 0-arg super at first position
		//output is 2 classes are executed
		
		
		-------------------------------------------------------------------------------------

		Example 8:
		
		class Parent(){
			Parent()
			{
			
			System.out.println("Parent class 0-arg constructor");
			}
		}
		Class Child extends Parent()
		{
			Child()
			{
			//super(); generated by compiler
			System.out.println("Child class constructor");
			}
			Child(int a)
			{
			//super(); generated by compiler
			System.out.println("Child class 1-arg constructor");
			}
			
			public static void main (String args[])
				{
				new Child();
				new Child(10);
				}
			
		}
		
		------------------------------------------------------------------------------------
		
		Example 9:
		
		class Parent(){
			Parent()
			{
			
			System.out.println("Parent class 0-arg constructor");
			}
		}
		Class Child extends Parent()
		{
			/* code is generated by compiler
			Child()
			{
			super();
			}
			*/
			
			public static void main (String args[])
				{
				new Child();
				new Child(10);
				}
			
		}
		