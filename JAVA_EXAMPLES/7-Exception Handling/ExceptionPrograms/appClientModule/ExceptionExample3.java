public class ExceptionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x = 0; 
		    int y = 5 / x; 
		}
		catch (ArithmeticException ae) //compilation fails here
		{
		    System.out.println(" Arithmetic Exception"); 
		} 
		//catch(Exception e)
		//{
		//	System.out.println(e);//out put is finally block
		//}
		
		System.out.println("finished");

	}

}
