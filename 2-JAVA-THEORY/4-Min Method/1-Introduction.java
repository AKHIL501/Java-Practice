
		
		
		public static void main (String[] args)----> JVM calls main method
		{
		}
		
		
		public :- jvm access main method , jvm is out side program , to give the access permission to jvm we declare public.
		
		static :- with out static the method is instance method, instance method means jvm must create the object ,with out creating 
		object to over come direct access to jvm the main is declared with static.
		
		void :- void is return type , dont return any values to main method.
		
		main():- main is method name it is alredy created in JVM, thus the reason jvm calls main method

		String[] args:- used to take the command line arguments, command line arguments stored in string array, in the form of the string format.
						args is variable of string array types.
						
						
			Modifications are allowed in main method
			
				1.modifier order is not important we can declare it as static public void main (String[] args)

				2. (String[] args), (String []args),(String args[]) 3 types are allowed.
				
				3. Instead of string array we can declare String... from 1.5 version.
				
				4. args---> String array type instead of args we can take any variable like a,b,c,....
				
				5. 5 methods are applicable in main method
					public
					static
					final
					strictfp
					synchronized
					
					public,static are mandatory
					final, strictfp, synchronized are optional
					
					public static void main (String[] args)------------> valid
					public static final  void main (String akhil[])----> valid
					static final strictfp void main (String... akhil)--> Invalid
					static final static strictfp int main (String... akhil)--> Invalid
					public final static synchronized strictfp void main (String... akhil)--> valid
					
					
			Example:-
					
				class Test
				{
				public final static synchronized strictfp void main (String... akhil)
				{
				System.out.println("hai");
				}
				}
					
					
			Explanation:-
			
				public :- jvm access main method , jvm is out side program , to give the access permission to jvm we declare public.
		
				static :- with out static the method is instance method, instance method means jvm must create the object ,with out creating 
				object to over come direct access to jvm the main is declared with static.
				
				void :- void is return type , dont return any values to main method.
				
				main():- main is method name it is alredy created in JVM, thus the reason jvm calls main method

				String[] args:- used to take the command line arguments, command line arguments stored in string array, in the form of the string format.
								args is variable of string array types.
				
				final :- override is not possible.
				
				strictfp :- introduced in 1.5 it is applicable for methods and classes.
							floating point calculations are varried form processor to processor and os to os.
							
							platform dependent output.
							
							it follows IEEE754 standards.
							
				synchronized :- only applicable for methods. only one thread allow to access.
				
					ex:-
						synchronized void m1()
						{
						}
						
					
					Ex 2:-
					
					*** child class is able to acquire parent class main method
					*** entire java static methods overriding is not possible.
					
					class Parent
					{
					public static void main (String[] args)
					{
					System.out.println("Parent class main");
					}
					}
					class Child extends Parent
					{
					public static void main (String[] args)
					{
					System.out.println("child class main");
					}
					}
					
					
					Ex 3:-
					// main method overloading
					// possible to over load main method.
					class Parent
					{
					public static void main (String[] args)--------> JVM claa string main method
					{
					System.out.println("String  main");
					}
					public static void main (int a)
					{
					System.out.println("int  main");
					}
					public static void main (char ch)
					{
					System.out.println("char main");
					}
					}
					
					// main method overloading
					class Parent
					{
					main(10);
					public static void main (String[] args)
					{
					System.out.println("String  main");
					}
					main('a');
					public static void main (int a)
					{
					System.out.println("int  main");
					}
					public static void main (char ch)
					{
					System.out.println("char main");
					}
					}
					
					
					1.possible to inherit the main method.
					2.not possible to override the main method because it is declared with static
					3.possible to over load main method.
					4. JVM always calls string main method.
					
					commandline arguments:-
					
					class Parent
					{
					main(10);
					public static void main (String[] args)
					{
					System.out.println(args.length); //length is a variable to find length of the array, length() used to find length of the string
					
					}
					}
					
					javac Parent
					java Parent 5 4 3 2 1