
public class Empolyee {
	long empId;
	String empName;
	
	 Empolyee(long id, String name) {
		this.empId = id;
		this.empName = name;
	}

	void   info() {
		System.out.println("Id :" + empId + " Name :" + empName);
	}

	public static void main(String[] args) {

		Empolyee sb = new Empolyee(9565,"Abuzar");
		sb.info();
	}
}
