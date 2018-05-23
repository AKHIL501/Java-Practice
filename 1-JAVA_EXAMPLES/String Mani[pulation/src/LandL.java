
public class LandL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[100];
		System.out.println(a.length);

		String s = "akhil";
		System.out.println(s.length());

		System.out.println(s.charAt(2));

		// System.out.println(s.charAt(20)); //exception

		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('l'));

		String rno = "13C51A0501";

		System.out.println(rno.contains("51A"));
		System.out.println(rno.startsWith("13C"));
		System.out.println(rno.endsWith("501"));

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String s1 = "   Akhil   ";
		System.out.println(s1.length());
		System.out.println(s1.trim().length());

	}

}
