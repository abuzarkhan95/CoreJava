package ExecptionHandling;

public class ThrowsandThrow {
	
	void m1(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			String v= "Ziddy Boy";
			System.out.println(c);
		}	
	}	
	public static void main(String[] args) {
		ThrowsandThrow t=new ThrowsandThrow();
		try
		{
			t.m1(30,6);
		
			
		}
		catch(Exception e)
		{
			System.out.println("nonkhari chaii");
			System.out.println("Ziddi Boy");
		}
	} 
	
	

}
