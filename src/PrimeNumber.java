import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static void main(String[] args) throws IOException{
	BufferedReader bufferedReader = new  BufferedReader(new InputStreamReader(System.in));
	System.out.println("number");
	bufferedReader.readLine();		
	for(int no = 1; no<=100; no++) {
		int temp =0;
	for(int i=2;i<no-1;i++) {
		if(no%i==0) {
		temp=temp +1;	
		}
	}
	if(temp==0) {
		System.out.println(no);
	}
	}
	

	}

}
