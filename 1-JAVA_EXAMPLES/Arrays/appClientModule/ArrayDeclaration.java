
public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------Declaration-1-----------------------------");
		int a[] =new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println("----------------------Declaration-2---------------------------");
		int []b =new int[5];
		b[0]=6;
		b[1]=7;
		b[2]=8;
		b[3]=9;
		b[4]=10;
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
		
		System.out.println("----------------------Declaration-3---------------------------");
		int[] c =new int[5];
		c[0]=11;
		c[1]=12;
		c[2]=13;
		c[3]=14;
		c[4]=15;
		for(int i=0;i<c.length;i++) 
		{
			System.out.println(c[i]);
		}
		
		System.out.println("----------------------Declaration-4---------------------------");
		int d[]= {16,17,18,19};
		
		for(int i=0;i<d.length;i++) 
		{
			System.out.println(d[i]);
		}
		
		
		}
	}


