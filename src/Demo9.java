
public class Demo9 {

		
		  public static void main(String[] args) {
		    
		    int a = 111, revers = 0, remainder;
		    int number = a;
		   
		 
		    while (a != 0) {
		      remainder = a % 10;
		      revers = revers * 10 + remainder;
		      a/= 10;
		    }
		    
		    if (number == revers) {
		      System.out.println(number + " is Palindrome.");
		    }
		    else {
		      System.out.println(number + " is not Palindrome.");
		    }
		  }

	}


