	Super keyword
	
	it represents the super class object
	
	Super class variables:-
	 
	 Example 1:-
	 class Parent{
	 int a=10;
	 int b=20;
	 }
	 class Child extends Parent
	 {
	 int x=100;
	 int y=200;
	 void add(int i, int j)
	 {
	 System.out.println(i+j);
	 System.out.println(x+y);
	 System.out.println(a+b);
	 
	 public static void main (String args[])
	 {
	 new Child().add(100,200);
	 }
	 }
	 }
	 
	 
	 Example 2:-
	 class Parent{
	 int a=10;
	 int b=20;
	 }
	 class Child extends Parent
	 {
	 int a=100;
	 int b=200;
	 void add(int a, int b)
	 {
	 System.out.println(a+b);
	 System.out.println(this.a+this.b);
	 System.out.println(super.a+super.b);
	 
	 public static void main (String args[])
	 {
	 new Child().add(1000,2000);
	 }
	 }
	 }