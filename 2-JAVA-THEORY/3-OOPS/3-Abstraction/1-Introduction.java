Abstraction:-
			The process of highlighting set of services and hiding its implementation is called abstaraction
			
			Methods:
				1.Normal Methods
				2.Abstract Methods:- only method declaration but not implementation 
				every abstract method ends with semicolon, represents abstract modifier.
				
				 Abstract classes are also called Helper classes.
				 
				 A class contains atleast one abstract method that class is called abstract class
				Object creation is not possible.
				
				abstract class may contains abstract methods or may not contains abstaract methods
				
				Example:-
				
				abstract class Test{
				void m1(){}
				void m2(){}
				abstract void m3();
				}
				
				abstract class Test{
				void m1(){}
				void m2(){}
				void m3(){}
				}
				
				
			***	How to prevent object creation:- using abstract class object creation is not possible.
			
			
			Example 1:-
				abstract class Test	
				{
				abstaract void m1();
				abstaract void m2();
				abstaract void m3();
				void m4(){System.out.println("m4 method");}
				}
				class Test1 extends Test
				{
				void m1(){System.out.println("m1 method");}
				void m2(){System.out.println("m2 method");}
				void m3(){System.out.println("m3 method");}
				
				public static void main (String[] args)
				{
					Test t=new Test();// generates error
					Test1 t= new Test1();
					t.m1();
					t.m2();
					t.m3();
					t.m4();
					
					// Parent p =new Child();
					
					Test t1 =new Test1();
					t1.m1(); //compile : Test runtime: Test1
					t1.m2();//compile : Test runtime: Test1
					t1.m3();//compile : Test runtime: Test1
					t1.m4();//compile : Test runtime: Test1
				}
				
				}
			
			
			
			
			Example 2:-
			
			abstract class Test	
			{
			abstaract void m1();
			abstaract void m2();
			abstaract void m3();
			}
			abstract class Test1 extends Test
			{
			void m1(){System.out.println("m1 method"); //one implementation
			}
			abstaract class Test2 extends Test1
			{
			void m2(){System.out.println("m2 method"); // one implementation
			}
			class Test3 extends Test2 // implementation is completed
			{
			void m2(){System.out.println("m2 method");
			}
			
			
			public static void main (String[] args)
			{
				Test3 t= new Test3();
				t.m1();
				t.m2();
				t.m3();
			}
			}
			
			We can write the constructors in abstract classes
			
			Example 3:-
			
			abstract class Test{
			Test()
			{
			System.out.println("abstract class constructor");
			}
			abstract void m1();
			}
			class Test1 extends test
			{
			void m1()
			{
			System.out.println("m1 method");
			}
			Test1()
			{
			super();	
			System.out.println("normal class constructor");
			}
			public static void main (String[] args)
			{
				 new Test1().m1();
				
			}
			}
			
			//Instance Blocks:
			abstract class Test{
			Test()
			{
			System.out.println("abstract class constructor");
			}
			{
			System.out.println("Instance Block");
			}
			static {System.out.println("static block");}
			}
			class Test1 extends test
			{
			void m1()
			{
			System.out.println("m1 method");
			}
			Test1()
			{
			super();	
			System.out.println("normal class constructor");
			}
			public static void main (String[] args)
			{
				 new Test1();
				
			}
			}
			
			
			-----------------------------------------------------------------------------------------------
			class : Complete implementation and declaration.
			
			abstract class :- Partial implementation and declaration.
			
			Interface:- only Declaration.
			
			
			Interfaces:
			
				file1:-
					package com.dss.declarations;
					public interface Message
					{
					void morn();
					void even();
					void gn();
					}
				file2:-
				package com.dss.client;
				import com.dss.declarations.Message;
				abstract class Helper implements Message
				{
					public void gn(){System.out.println("Helper class good night");}
				}
				file3:-
				import com.dss.declarations.Message;
				public class TestClient1 implements Message
				{
				// Must override 3 methods
					public void morn(){System.out.println(" good morning");}
					public void even(){System.out.println(" good evening");}
					public void gn(){System.out.println(" good night");}
					public static void main (String[] args)
					{
					TestClient1 t=new TestClient1();
					t.morn();
					t.even();
					t.gn();
					}
				}
			file4:-
				package com.dss.client;
				import com.dss.helper.Helper;
				public class TestClient2 extends Helper
				{
				// 2 methods implementations
				//1 method implementation from helper class.
					public void morn(){System.out.println(" good morning");}
					public void even(){System.out.println(" good evening");}
				
					public static void main (String[] args)
					{
					TestClient2 t=new TestClient2();
					t.morn();
					t.even();
					t.gn();
					}
				}
			
			
			
			
			javac -d . Message.java //f1
			javac -d . Helper.java //f2
			javac -d . TestClient1.java //f3
			javac -d . TestClient2.java //f4
			
			fully qualified name:- complete class name with package name
			java com.dss.client.TestClient1
			java com.dss.client.TestClient2
			
			
			
			
			
			