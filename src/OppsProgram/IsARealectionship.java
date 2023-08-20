package OppsProgram;
abstract class Bike{
	abstract String run();
}
class Honda extends Bike{
	String run() {
		return "Honda Bike Is Running";
	}
}
public class IsARealectionship {

	public static void main(String[] args) {
		Honda honda=new Honda();
		System.out.println(honda.run());
	}

}
