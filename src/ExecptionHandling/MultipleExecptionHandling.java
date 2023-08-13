package ExecptionHandling;

import java.util.concurrent.ForkJoinTask;

public class MultipleExecptionHandling {

	public static void main(String[] args) {
	 
		try {
			
			int a=90,b=0,c;
			c=a/b;
			System.out .print(c);
		}
		
		catch(ArithmeticException a)
		{
			
			System.out.println("not zero divided");
			
		}
		
		try 
		{
		int a[]= {20,50,50};
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException f) {
	
		System.out .print("not index five");
		

		}
	}

}
