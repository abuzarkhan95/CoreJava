package OppsProgram;

    abstract class Steal {
	abstract String sofa();

	abstract String bed();

	abstract String chair();

	abstract String plate();
    }
	public class Abstraction3  extends  Steal{
  
	String sofa() {

		return "Sofa";
	}

	String bed() {

		return "bed";
	}
	String chair() {
	return "chair";
	}
	String plate() {
		return "plate";
	}
	public static void main(String[] args) {		
	Steal s=new Abstraction3();	 
	s.sofa();
	s.bed();
	s.chair();
	s.plate();
	System.out.println(s.sofa()+" \n"+ s.bed()+" \n"+ s.chair()+" \n"+ s.plate());
	}
}
0