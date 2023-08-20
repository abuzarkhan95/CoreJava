package OppsProgram;
interface Programming{
	String java() ;
}
class Programming1 implements Programming{
	public String java() {
		return "3-> Java is a Programming";
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Programming1 p=new Programming1();
		
	System.out.println(p.java());
	}

}
