
Java supports 8 primitive data types

1.byte
2.short
3.int
4.long
5.float
6.double
7.char
8.boolean

these are the 8 primitive data type.To represent these 8 primitive data types in the form of object we require 8 
java classes those 8 java are called wrapper classes.

java is object oriented language everyting in the form of the object, but jav supports primitives, primitives not at all a objects
to represent these primitives in the form of the object we required 8 classes these 8 classes are called wrapper classes.

Datatype				Wrapperclass
1.byte	---------->		1.Byte
2.short ---------->		2.Short
3.int	---------->		3.Integer
4.long  ---------->		4.Long
5.float	---------->		5.Float
6.double --------->		6.Double
7.char	 --------->		7.Character
8.boolean -------->		8.Boolean

*** All wrapper classes are present in the java.lang 
wrapper classes are mostly used in structs and springs level.	

Creating object in Integer class 

Integer a =new Integer(10); //(new Integer(10); this is the constructor part it accepting primitive value)
System.out.println(a);

Integer b =new Integer("10"); //(new Integer(10); this is the constructor part it accepting string value)
System.out.println(a);

Integer b =new Integer("one"); //Number format exception
System.out.println(a);


Datatype				Wrapperclass		constructors
1.byte	---------->		1.Byte				byte,String
2.short ---------->		2.Short				short,String
3.int	---------->		3.Integer			int,String
4.long  ---------->		4.Long				long,String
5.float	---------->		5.Float				double,float,String
6.double --------->		6.Double			double,String
7.char	 --------->		7.Character			char
8.boolean -------->		8.Boolean			boolean,String

Float f1= new Float(10.5); // (default point values are double)
Float f2= new Float(10.5f); // (float)
Float f2= new Float("10.5"); // (float)

Character ch= new Character('a');

*** All wrapper classes are immutable (doesn't allow modifications)


***Character wrapper class and Boolean wrapper classes are direct child of Object class 
***Number class contains remaining wrapperclasses. Number is the child class of object.

Main imp methods

1.valueof()
2.toString()
3.xxxValue()
4.parseXXX()

