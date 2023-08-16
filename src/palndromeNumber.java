
public class palndromeNumber {

	public static void main(String[] args) {
	int num= 5335, revers= 0, remainder;
	int palndrome = num;
	while(num !=0) {
	remainder= num % 10;
	revers= revers * 10 + remainder;
	num /= 10;
	}
	if(palndrome==revers) {
		System.out.println(palndrome+ " is a palndrome.");
	}
		else {
		System.out.println(palndrome+ " not is a palndrome.");	
			
		}

	}
}
		
		
	

	


