package OppsProgram;
abstract class Mobile{
	public abstract void turnOn();
	public abstract void turnOf();
}
class Oppo extends Mobile{
	public void turnOn() {
		System.out.println("Mobile turn on");
	}
public void turnOf() {
	System.out.println("Mobile turn off");
}
}
public class AbstractExp {

	public static void main(String[] args) {
	Oppo d= new Oppo();	
         d.turnOn();
         d.turnOf();
	}

}
