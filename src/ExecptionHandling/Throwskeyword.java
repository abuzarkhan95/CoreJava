package ExecptionHandling;

public class Throwskeyword {

	public static void main(String[] args)  
	{ 
		for(int i=1;i<=10;i++) {
		try
		{
			
				System.out.println(i);
				Thread.sleep(10000);
		}
		  
		catch( InterruptedException e)
		{
			System. out.println(e);
		}
		}
		
		
	}

}
