package OppsProgram;
interface Laptop{
	String coading() ;
	String game();
	}
class Laptop1 implements Laptop{
	public String coading() {
		return "Is Coading";
	}
	public String game() {
		return "Playing Game";
	}
}
public class HasARealectionship {

	public static void main(String[] args) {
	Laptop1 laptop1=new Laptop1();
	String laptop=laptop1.coading();
	String laptop2=laptop1.game();
	System.out.println(laptop+"\n"+laptop2);
	}

}
0