Encapsulation:
			binding or wrapping the data into single unit
			
			
			
			Java beans
			
			Private properties and public setters and getters
			
			Example:-
			 // Java Bean class or VO class (Value Object Class) or BO class (Business Object Class) DTO (data transfer object class)
			 class EmpBean
			 {
			 // instance variables
			 private int eid;
			 private String ename;
			 
			 //setters (used to set the values to properties)
			 
			 public void setEid(int eid) //local
			 {
			 this.eid=eid;
			 } 
			 public void setEname(String ename) //local
			 {
			 this.ename=ename;
			 }
			 
			 //getters are used to get the values from properties
			 
			 public int getEid()
			 {
			 return eid;
			 }
			 public String getEname()
			 {
			 return ename;
			 }
			 }
			 
			 
			 file 2:-
			 class TestClient
			 {
			 public static void main(String[] args)
			 {
			 EmpBean eb1= new EmpBean();
			 
			 //setters are used to set the data
			 eb1.setEid("501");
			 eb1.setName("Akhil");	
			 
			 //getters are used to get the data
			 int eid =eb1.getEid();
			 System.out.println(eid);
			 
			 String ename =eb1.getName();
			 System.out.println(ename);	
			 }
			 }
			 
			 
			 Java CLasses;
			 
			 1.normal class
			 2.abstract class
			 3.parent class
			 4.child class
			 5.Java bean
			 6.Adapter class:-empty implementations of interface method
			 7.public class
			 8.default class
			 9.tightly encapsulated class
			 10.implementation class
			 11.final class
			 12.mutable class
			 13.immutable class
			 14.strictfp class--->IEEE754
			 15.singleton class