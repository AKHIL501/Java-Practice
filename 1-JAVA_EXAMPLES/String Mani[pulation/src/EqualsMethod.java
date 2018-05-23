
public class EqualsMethod {
	
	EqualsMethod(String str )
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		EqualsMethod em =new EqualsMethod("akhil");
		EqualsMethod em2 =new EqualsMethod("akhil");
		System.out.println(em.equals(em2));
		
		String s="akhil";
		String s1="akhil";
		System.out.println(s.equals(s1));
		
		String s3= new String("akhil");
		String s4=new String("akhil");
		System.out.println(s3.equals(s4));
		
		StringBuffer sb=new StringBuffer("AKHIL");
		StringBuffer sb1=new StringBuffer("AKHIL");
		System.out.println(sb.equals(sb1));

		class Object
		{
			public boolean equals()
			{
				return true;//ref-comparision
			}
		}
		class String extends Object
		{
			public boolean equals()
			{
				return true;//content-comparision
			}
		}
		
		class StringBuffer extends Object
		{
			public boolean equals()
			{
				return true;//content-comparision
			}
		}
		}
		
		
	}


