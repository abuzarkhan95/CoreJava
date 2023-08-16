
public class ArmstrongNumber {

	public static void main(String[] args) {
	int number=371,armno,remainder,	result=0;
	armno=number;
	while(armno!= 0) {
	remainder= armno% 10;
	result += Math.pow(remainder,3);
	armno /= 10;
	if(result == number) {
	System.out.println(number + " is an Armstrong number");	
	}
	else {
	System.out.println(number + " is not an Atmstrong number");	
	}
	}

	}

}
