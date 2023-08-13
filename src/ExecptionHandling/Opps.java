package ExecptionHandling;

public class Opps {
	int inheritance1(int c) {
		return c;

	}

	char inheritance1(char a) {
		return a;
	}

	String inheritance1(String b) {
		return b;
	}

	public static void main(String[] args) {
		Opps s = new Opps();
		int a = s.inheritance1(10);
		char c = s.inheritance1('a');
		String b = s.inheritance1("abc");
		System.out.println(a + "\n" + c + "\n" + b);
	}

}
