package ExecptionHandling;

public class Nestedfinallyblock {

	public static void main(String[] args) {
	
	try
	{
		String a= "";
		System.out.println("Abuzar");
	}
	catch(Exception n)
	{
		System.out.println(n);
	}
	finally
	{
		try
		{
			System.out.println(188/4);
			
		}
		catch(ArithmeticException h )
		{
			System.out.println(h);
			
		}
		
	finally
	{
		System.out.println("nonkhari chaii");
	}
	
	}
	System.out.println("nonkhari and silent");
	}
	
}
