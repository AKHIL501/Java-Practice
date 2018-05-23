
public class StaticVariables {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		
		System.out.println("-----------Static area----------------");
		// TODO Auto-generated method stub
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
		System.out.println(StaticVariables.a+StaticVariables.b);
		
		StaticVariables sv=new StaticVariables();
		
		sv.method1();
	}
	

void method1()
{
	System.out.println("-----------Instance area----------------");
	System.out.println(StaticVariables.a);
	System.out.println(StaticVariables.b);
	System.out.println(StaticVariables.a+b);
}
	}


