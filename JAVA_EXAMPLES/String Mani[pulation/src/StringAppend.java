
public class StringAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Akhil";
		s1.concat("Abothu");
		System.out.println(s1);//Akhil because strings are immutable
		
		String s2="Akhil";
		s2=s2.concat("Abothu");
		System.out.println(s2);
		
		StringBuffer sb=new StringBuffer("Akhil");
		sb.append("Abothu");
		System.out.println(sb);
		
		//Comparison
		
		String s3="Abhi";
		String s4="ABHI";
		 
		
		
		
		
	}

}
