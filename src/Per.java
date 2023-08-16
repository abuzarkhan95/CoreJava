
import java.util.Scanner;

public class Per {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = sca.nextInt();
		System.out.println("Enter your percentage");
		int percentage = sca.nextInt();
		if (age >= 18 && age <= 21 && percentage >= 80) {
			System.out.println("Eligble");

		} else {

			System.out.println("not eligible");

		}

	}
}
