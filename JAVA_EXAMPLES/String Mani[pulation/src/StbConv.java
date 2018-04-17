public class StbConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// convertion of string to string buffer

		String str = "akhil";

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//StringBuffer to String
		StringBuffer sb1 = new StringBuffer("AKhil");
		String ss=sb1.toString();
		System.out.println(ss);
	}

}
