// one method is calling another method using method name
class Man
	{
	void m1()
	{
	m2(); // Instance method calling //m3 m2
		  //*** all the statements in m2 is executes then m1 method is executed
		  m2(); //m3 m2
	System.out.println("M1 method");
	}
	void m2()
	{ 
	m3(10);
	System.out.println("M2 method");
	}
	void m3(int a)
	{ 
	System.out.println("M3 method");
	}
	 
	public static void main (String[] args)
	{
	Man m=new Man();
	m.m1();
	
	}
	}