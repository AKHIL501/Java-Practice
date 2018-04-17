//Method without arguments
public class Methods {
	
	//Methods without arguments
		void m1()
		{
		System.out.println("Without arguments Method 1");
		}
		static void m2()
		{
		System.out.println("Without arguments Method 2");
		}
		
		
		//Methods without arguments
				void m1(int a)
				{
				System.out.println("With arguments Method 1");
				}
				static void m2(int a)
				{
				System.out.println("With arguments Method 2");
				}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods im=new Methods();
		
		im.m1(); // by using object reference we call instance methods
		im.m1(10);
		
		Methods.m2();// by using class name we call static methods
		Methods.m2(10);

	}

}
