class This
	 {
	 int x=100;
	 int y=200;
	 void add(int x, int y)
	 {
	 System.out.println(x+y);
	 System.out.println(this.x+this.y);// Instance variables 
	 }
	public static void main (String[] args)
	{
	This t=new This();
	t.add(10,20);
	
	}
	}