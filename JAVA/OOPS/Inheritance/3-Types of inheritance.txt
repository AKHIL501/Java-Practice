Types of inheritance in java

	5 types of inheritance in java
	
	1.Single Inheritance
	2.Multilevel
	3.Multiple
	4.Hierarchical
	5.Hybrid
	
	java supports only 3 inheritances
	
		1.single
			ex:-
				class A{}
				class B extends A{}
		2.multilevel
			ex:-
				class A{}
				class B extends A{}
				class C extents class B{}
		
		3.hierarchical
			ex:-
				class A{
				void m1()
				{
				System.out.ptintln("Method m1");
				}
				void m2()
				{
				System.out.ptintln("Method m2");
				}
				class B extends A{
				void m1()
				{
				System.out.ptintln("Method m1");
				}
				void m2()
				{
				System.out.ptintln("Method m2");
				}
				void m3()
				{
				System.out.ptintln("Method m3");
				}
				void m4()
				{
				System.out.ptintln("Method m4");
				}
				}
				class C extents class A{
				void m1()
				{
				System.out.ptintln("Method m1");
				}
				void m2()
				{
				System.out.ptintln("Method m2");
				}
				void m3()
				{
				System.out.ptintln("Method m3");
				}
				void m4()
				{
				System.out.ptintln("Method m4");
				}
				void m5()
				{
				System.out.ptintln("Method m5");
				}
				void m6()
				{
				System.out.ptintln("Method m6");
				}
				public static void main (String[] args)
				{
				A a=new A();
				a.m1();a.m2();
				
				B b=new B();
				b.m1();b.m2();
				b.m3();b.m4();
				
				C c=new C();
				c.m1();c.m2();
				c.m3();c.m4();
				c.m5();c.m6();
				}
				}

				
				
			Example	
				
				
	java doesn't support multiple and hybrid inheritances  because its generates ambiguity
	
	
	Example:
	
	Inheritance Prevention
	
		When class declared with final keyword child creation is not posssible.
		
		Example:-
		
		final class A{}
			class B extends A{}// inheritance not possible
			
	