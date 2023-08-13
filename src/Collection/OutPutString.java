package Collection;



public class OutPutString {

	public static void main(String[] args) {
		String s=  "My name";
		String [] ch=s.split(" ");
		for(int i=0;i<ch.length;i++) {
		for(int j=ch[i].length()-1; j>=0; j--) {
		System.out.print(ch[i].charAt(j));
		}
		System.out.print(" ");
}	
	}
}