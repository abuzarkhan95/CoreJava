
public class ReversNumber {

	public static void main(String[] args) {
	int no=956516,revers = 0;
	while(no != 0) {
		int remainder = no %10;
		revers = revers * 10 + remainder;
		no=no/10;	}
	System.out.println("The reverse of the numberis:" +revers);

	}

}
