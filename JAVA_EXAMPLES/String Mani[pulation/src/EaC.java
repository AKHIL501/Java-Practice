
	public class EaC {
	
		public static void main(String[] args) {
	
			String s = "Akhil";
			String s2 = "Abhi";
			String s3 = "Akhil";
			// equals()
			System.out.println(s.equals(s2));// false
			System.out.println(s.equals(s3));// true
			System.out.println(s3.equals(s2));// false
	
			System.out.println("AKHIL".equals("akhil"));// flase
			System.out.println("AKHIL".equalsIgnoreCase("akhil"));// true
			// compareTo()
			System.out.println(s.compareTo(s2));
			System.out.println(s.compareTo(s3));
			System.out.println(s2.compareTo(s3));
			
			System.out.println("AKHIL".compareTo("akhil"));
			System.out.println("AKHIL".compareToIgnoreCase("akhil"));
		}
	}
