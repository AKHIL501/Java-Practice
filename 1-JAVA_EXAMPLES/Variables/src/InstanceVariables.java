
public class InstanceVariables {
			int a=10;
			int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Static area----------------");
		
		InstanceVariables iv =new InstanceVariables();
			System.out.println(iv.a);
			System.out.println(iv.b);
			System.out.println(iv.a+iv.b);
			
			iv.method1();
			
			
	}
	
	void method1()
	{
		System.out.println("-----------Instance area----------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}

}
