//Methods Accepting objects	

		class X{}
		class Emp{}
		class Y{}
		class Stu{}
		
		class Test
	{
	void m1(X x, Emp e)// Instance method // 
	{
	System.out.println("M1 method");
	}
	static void m2(Y y, Stu s)//static method
	{
	System.out.println("M2 method");
	}
	public static void main (String[] args)
	{
	Test t=new Test();
	X x=new X();
	Emp e1=new Emp();
	t.m1(x,e1);//t.m1(new X(), new Emp())
	
	Y y=new Y();
	Stu s = new Stu();
	Test.m2(y,s);//Test.m2(new Y(), new Stu())
	}
	}
