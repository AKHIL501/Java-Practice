class ToStringMethod {
	public static void main(String args[]) {
		ToStringMethod t = new ToStringMethod();
		ToStringMethod t1 = new ToStringMethod();
		System.out.println(t);
		System.out.println(t.toString());// --------> both outputs are same. (Test@17f1ba3) hashcode
		System.out.println(t1);
	}
}