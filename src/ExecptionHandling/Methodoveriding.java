package ExecptionHandling;

class Test {
	void m1() {
		System.out.println("saki");

	}

}

public class Methodoveriding extends Test {
	void m1() {

		System.out.println("naka");

	}

	public static void main(String[] args) {
		Test f = new Methodoveriding();
		f.m1();
		
	
	}
}
