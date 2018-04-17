public class ToStringMethod2 {

	int eid;
	String ename;

	ToStringMethod2(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;

	}

	// Overriding toString method
	public String toString() {
		return "emp id=" + eid + " emp name=" + ename;
	}

	public static void main(String[] args) {
		ToStringMethod2 s = new ToStringMethod2(1, "Akhil");
		System.out.println(s);
	}

}
