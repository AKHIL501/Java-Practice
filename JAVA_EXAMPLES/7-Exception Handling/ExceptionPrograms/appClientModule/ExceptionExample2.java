
public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x = 0; 
		    int y = 5 / x; 
		}
		catch(Exception e)
		{
			System.out.println(e);//out put is finally block
		}
		//catch (ArithmeticException ae) //compilation fails here
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//	Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		//{
		//    System.out.println(" Arithmetic Exception"); 
		//} 
		System.out.println("finished");

	}

}
