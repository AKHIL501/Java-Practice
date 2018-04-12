
public class ExceptonExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
        {
            badMethod();  
            System.out.print("A");  
        } 
        catch (RuntimeException ex) /* Line 10 */
        { 
            System.out.print("B"); 
        } 
       
        finally 
        {
            System.out.print("D"); 
        } 
        System.out.print("E"); 
    } 
    public static void badMethod() 
    { 
        throw new RuntimeException(); 
    } 
	}

//output:-
//BDE

