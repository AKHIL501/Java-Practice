											
										
													Java
													  |
													  |
												   Packages
													  |
													  |
											  classes/interfaces
													  |
													  |
												   Methods
										
	
	Packages:- In Java the predefined support in the form of the packages
				
				ex:- java.lang.*;
				
				package is a folder structure
				java.lang
					java--> java flder , lang--> lang folder
				
				java contains 14 predefined packages
				these 14 predefined packages contain 150(not fixed)sub packages.
				150(not fixed)sub packages containg 7 thousand classes.
				

					packages 2 types:
					
					1.Predefines (14 upto 1.7)
					***java.times introduced in java 1.8
					
					2.user defined
					
					every package statement is nothing but one module
					
					*** the source file is allowed to create only one package.It is must be first statement of the source file.
					
					coding conventions 
					
					1. Ex:- www.tcs.com

						take package name reverse of the domain name
						like:-com.tcs
				
				
				
		Package example 1:-
		Step 1:- write the application with package statement.
		package com.dss.java.corejava;
		 class Test
		 {
		 public static void main (String[] args)
		 {
			System.out.println("package first example");
		 }
		 }
		 class A
		 {
		 }
		 class B
		 {
		 }
		 interface It
		 {
		 }
		 
		 
		 
		 step 2:-
		 comppile the application
		 
		 compile with:- javac -d . Test.java
		 javac-------> java compiler
		 -d ---------> create folder structure
		 . ----------> place folders structure in current working directory
		 Test.java --> file name.
		 
		 
		 Step 3:
		 
		 com
		  |--------->dss
					  |-------->java
								  |------>corejava
											  |------>Test.class
											  |------>A.class
											  |------->B.class
											  |------> It.class
											  
											  
											  
		 Step 4:-
		 
		 execute the class by full qualified name
		 
		 fully qualified name means :- class name with complete package structure.
		 
		 Ex:- java com.dss.java.corejava.Test
		 
		 
		 
		 
		 Example 2:- one package is using another package class.
		module 1:-
		
		 package com.dss.states.info
		 
		public class Durga
		 {
		 void ts()
		 {
		 System.out.println("Telangana State");
		 }
		 void ap()
		 {
		 System.out.println("AP State");
		 }
		 void others()
		 {
		 System.out.println("Others State");
		 }
		 }
		 
		 
		 module 2:-
		 // error 1---> import package --2 approaches 1.importing all classes 2. importing application required classes
		 // error 2---> make class as public 
		 
		  
		  package com.dss.states.requiredinfo;
		  import  com.dss.states.info.Durga;
		 class Tcs
		 {
			public static void main (String[] args)
			{
			Durga d = new Durga();
			d.ts();
			d.ap();
			d.others();
			}
		 }
		 
		 