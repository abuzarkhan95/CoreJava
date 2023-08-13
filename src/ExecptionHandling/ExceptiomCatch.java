package ExecptionHandling;

public class ExceptiomCatch {

	public static void main(String[] args) {

		int[] arr= new int[4];
		
		try
		{
			int i= arr[4];
			
			System.out.println("Inside try block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			 System.out .print("Excption caught in catch block");
		}
		System .out .print("Outside try catch clause");
	

	}

}
