package ExecptionHandling;

import javax.management.RuntimeErrorException;
       class Cooking {
	    void cook() throws RuntimeException {
		System.out.println("cooking in progress");
		throw new RuntimeException("oops cooking failed");
	}
}
    class Chef extends Cooking {
	void cook() {
		System.out.println("chef is cooking a delicious dish");

		try {
			super.cook();
		} catch (RuntimeException e) {
			
			System.out.println("Chef caught the cooking exception" + e.getMessage());
		}
	}
}

public class ExceptionHandlingInOverriding {

	public static void main(String[] args) {
		Cooking chefCooking = new Chef();
		chefCooking.cook();
	}

}
