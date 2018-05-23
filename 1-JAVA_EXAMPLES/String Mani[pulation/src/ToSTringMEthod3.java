
public class ToSTringMEthod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Akhil";
		System.out.println(s);
		System.out.println(s.toString());

		StringBuffer sb = new StringBuffer("Akhil");
		System.out.println(sb);
		System.out.println(sb.toString());
		/*
		 * // // class Object { // public String toString() { // return
		 * "class-name@hashcode"; // } // } // // class String extends Object // { //
		 * public String toString() // { // return "String Class Object"; // } // }
		 * 
		 * class StringBuffer extends Object { public String toString() { return
		 * "StringBuffer class Object"; } } }
		 */

	}
}
