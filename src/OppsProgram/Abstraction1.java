package OppsProgram;
abstract class Chair{
	abstract void man();
}
class Table extends Chair{
void man() {
	System.out.println("Plastic");
}
}
public class Abstraction1 {

	public static void main(String[] args) {
	Table d = new Table();
	d.man();

	}

}
0