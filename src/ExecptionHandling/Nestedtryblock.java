package ExecptionHandling;

public class Nestedtryblock {

	public static void main(String[] args) {
		
		try {
		
		try 
			
		{
			int a[]= {100,123,44};
			System.out.println(a[7]);
			
		}
		
		catch ( ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		System.out.println(100/2);
		
	}
		
		catch(ArithmeticException e)
		{
			
		System.out.println(e);	
			
		}
		System.err.println("abuzar");
		
	}

}
