package ExecptionHandling;
class Superclass{
	void doSomething()throws InterruptedException{
		System.out.println("Superclass is doing something");
		throw new InterruptedException();
	}
}
class Subclass extends Superclass{
	void doSomething()throws InterruptedException{
		System.out.println("Subclass is doing something");
		throw new InterruptedException("Subclass Interrupted");
	}
}
public class ExceptionHandlingOveriding {
	public static void main(String[] args) throws InterruptedException {
		Subclass subclass=new Subclass();
		subclass.doSomething();
	}

}
