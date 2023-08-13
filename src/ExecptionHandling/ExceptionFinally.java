package ExecptionHandling;

public class ExceptionFinally {
	public static void main(String[] args) {
		
		try
		{
			System.out.println("whataspp");
			int a=20,b=3,c;
			c=a/b;
			System.out.println(a);
			System.out.println("Instagram");
		}
		
		catch(ArithmeticException a)
		{
			
			int z=20,v=0,x;
			x=z/v;
			
			System.out.println("can not divided by zero");
			
		}
		finally
		{
		System.out.println("Facebook");
			
		}
		System.out.println("main madthod ended");
	}

}
