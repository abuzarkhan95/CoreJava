package ExecptionHandling;

class GrandParent {
	void doSomething() {
		System.err.println("parent is doing something");
		int result = 10 / 0;
	}
}

class Father extends GrandParent {
	void doSomething() {
		System.out.println("child is doing something");
		try {
			super.doSomething();

		} catch (ArithmeticException e) {
			System.out.println("caughtexception in child " + e.getMessage());
		}
	}
}

public class ExceptionHandlingInOverridingSimple6 {

	public static void main(String[] args) {

		GrandParent pr = new Father();
		pr.doSomething();
	}

}
