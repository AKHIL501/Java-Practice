Constructors 
Instance Blocks

		1.used to write the logics
		2.Execution during object creation
		
		
		
		Test t =new Test();
		
		Rules to declare constructors in java
		1.Constructor name & class name must be same
		2.Constructor able to take parameters
		3.Constructor not allowed return type
		
		
		Types of constructors
		
		1.Default constructor
		2.user defined constructor (Parametarised constructor)
		
		1.Default constructor
		
		Examples:---
		class Test
		{
		void m1()// Instance method
		{
		System.out.println("M1 method");
		}
		
		public static void main (String[] args)
		{
		Test t=new Test();
		t.m1();
		}
		}
	
	2.user defined constructor (Parametarised constructor)
	
		class Test
		{
		void m1()// Instance method
		{
		System.out.println("M1 method");
		}
		Test()
		{
		System.out.println("0 arg constructor");
		}
		Test(int a)
		{
		System.out.println("1 arg constructor");
		}
		
		public static void main (String[] args)
		{
		Test t=new Test(); //execution 1
		Test t1=new Test(10);//execution 2
		t.m1();//execution 3
		t1.m1();//execution 4
		}
		
		Example:--
		
		
		class Test
		{
		Test(int a)
		{
		System.out.println("1 arg constructor");
		}
		
		public static void main (String[] args)
		{
		Test t=new Test(); //execution 1 // generates error no 0 arg constructor
		Test t1=new Test(10);//execution 2
		
		}
		
		Advantage:-
		
		1.constructor logics are executed during object creation
		
		class Test
		{
		Test(int a)
		{
		System.out.println("1 arg constructor");
		}
		
		public static void main (String[] args)
		{
		Test t1=new Test(10);
		}
		
		2.
		used to initialize some values to instance variables during object creation
		case :1 problem---------> default values are printed while obj is created.
		
		
		class Emp
		{
		int id,
		String name;
		float salary;
		Emp()
		{
		id=1;
		name="Akhil";
		salary="40000.00f";
		}
		
		void disp()
		{
		System.out.println("id--->"+id);
		System.out.println("Name--->"+name);
		System.out.println("Salary--->"+salary);
		}
		public static void main (String[] args)
		{
		Emp e=new Emp();
		e.disp();
		}
		
		//problem 
		
		class Emp
		{
		int id,
		String name;
		float salary;
		Emp()
		{
		id=1;
		name="Akhil";
		salary="40000.00f";
		}
		
		void disp()
		{
		System.out.println("id--->"+id);
		System.out.println("Name--->"+name);
		System.out.println("Salary--->"+salary);
		}
		public static void main (String[] args)
		{
		Emp e=new Emp();
		e.disp();
		Emp e1=new Emp();
		e1.disp();
		}
		}
		
		//solution
		
		class Emp
		{
		int id,
		String name;
		float salary;
		Emp(int id,String name,float salary)
		{
		this.id=id;
		this.name=name;
		this.salary=salary;
		}
		
		void disp()
		{
		System.out.println("id--->"+id);
		System.out.println("Name--->"+name);
		System.out.println("Salary--->"+salary);
		}
		public static void main (String[] args)
		{
		Emp e=new Emp(1,"Akhil",20000);
		e.disp();
		Emp e1=new Emp(2."Teju",40000);
		e1.disp();
		}
		}
		
		//Constructor calling
		Example:1
	class Test
		{
		Test()
		{
		System.out.println("0");
		}
		Test(int a)
		{
		System.out.println("1");
		}
		Test(int a, int b)
		{
		System.out.println("2");
		}
		public static void main (String[] args)
		{
		Test t =new Test();
		}
		}
		
		Example:2
	class Test
		{
		Test()
		{
		this(10);
		System.out.println("0");
		}
		Test(int a)
		{
		System.out.println("1");
		}
		Test(int a, int b)
		{
		System.out.println("2");
		}
		public static void main (String[] args)
		{
		Test t =new Test();
		}
		}
		
		Example :3 // Error
		class Test
		{
		Test()
		{
		this(10);
		System.out.println("0");
		}
		Test(int a)
		{
		this(10,20);
		System.out.println("1");
		}
		Test(int a, int b)
		{
		System.out.println("2");
		}
		public static void main (String[] args)
		{
		Test t =new Test();
		}
		}
		
		
		Example 4: // problem // One constructor is able to call one constructor at a time	
		class Test
		{
		Test()
		{
		this(10);
		this(10,20); // error this inly first statement only
		System.out.println("0");
		}
		Test(int a)
		{
		
		System.out.println("1");
		}
		Test(int a, int b)
		{
		System.out.println("2");
		}
		public static void main (String[] args)
		{
		Test t =new Test();
		}
		}
		
	------------------------------------------------------------------------------------

formats of object creation

1.Named Approach // reference variable
2.Name less approach //no reference variable

	
	1.Named Approach // reference variable
	
	Test t =new Test();
	
	2.Name less approach //no reference variable
	new Test();
	
	
	Example:
	
	
	class Test
		{
		Test()
		{
		System.out.println("0");
		}
		Test(int a)
		{
		
		System.out.println("1");
		}
		Test(int a, int b)
		{
		System.out.println("2");
		}
		public static void main (String[] args)
		{
		//Named approach
		Test t =new Test();
		Test t =new Test(10);
		Test t =new Test(10,20);
		
		//Nameless approach
		new Test();
		new Test(10);
		new Test(10,20);
		}
		}
		
		
		