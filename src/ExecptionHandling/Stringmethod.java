package ExecptionHandling;

public class Stringmethod {

	public static void main(String[] args) {
	
		String a= "ABUZAR";
		String b= "abuzar";
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.err.println(b.concat(a));
		System.out.println(b.length());
		String c= "           abuzar                    ";
		String d=  "";
		System.out.println(c.trim());
		System.out.println(d.isEmpty());
		System.out.println(b.charAt(2));System.out.println(a.indexOf('r'));
		

	}

}
