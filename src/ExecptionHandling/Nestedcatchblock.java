package ExecptionHandling;

public class Nestedcatchblock {

	public static void main(String[] args) {
	
		try 
			
		{
			System.out.println(100/10);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	try{
		 
	
String a="ABUZAR";
System.out.println(a.toLowerCase());
	
	}
	
	catch(NullPointerException n)
	{
		System.out.println("not converted null value");
	}
	
	System.out.println("main mathod ended");

}
}
