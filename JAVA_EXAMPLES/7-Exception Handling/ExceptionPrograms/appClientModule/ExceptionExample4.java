public class ExceptionExample4
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B");  
        } 
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() 
    {
        throw new Error(); /* Line 22 */
    } 
}

//output:-
//CException in thread "main" java.lang.Error
//at ExceptionExample4.badMethod(ExceptionExample4.java:22)
//at ExceptionExample4.main(ExceptionExample4.java:7)
