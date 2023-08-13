package ExecptionHandling;

public class Multiplecatchblock {

	public static void main(String[] args) {

		try {
			int a = 28, b = 2, c;
			c = a / b;
			System.out.println(c);

			String str = "abuzr";
			System.out.println(str.toUpperCase());

			int arr[] = { 12, 33, 44 };
			System.out.println(arr[4]);

		} 
		
		catch (NumberFormatException g) {
			System.out.println(g);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException a) {

			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
