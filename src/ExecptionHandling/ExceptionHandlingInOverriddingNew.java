package ExecptionHandling;

import javax.management.RuntimeErrorException;

class Parent {
	void doSomething() throws RuntimeException {
		System.out.println("Parent is doing something");
		throw new RuntimeException("RuntimeException from parent");
	}
}

class Child extends Parent {
	void doSomething() throws RuntimeErrorException {
		System.out.println("child is doing something");
		throw new RuntimeException("Runtime Exception from child");
	}
}

public class ExceptionHandlingInOverriddingNew {
	public static void main(String[] args) {
		Parent par = new Child();
		try {
			par.doSomething();
		} catch (RuntimeException e) {
			System.out.println("Caught exception " + e.getMessage());

		}
	}
}
