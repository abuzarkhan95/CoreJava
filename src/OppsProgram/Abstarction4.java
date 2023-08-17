package OppsProgram;
abstract class Doctor{
abstract String cardiologist();
abstract String neurologist();
abstract String dermatologist();
}

public class Abstarction4 extends Doctor {

public String cardiologist() {
	
	return "cardilogist heart";
}
public String neurologist() {
	
	return "neurologist brain";			 
}
public String dermatologist() {
	return "dermatologist skin";

}
  

	public static void main(String[] args) {
	Doctor s = new	Abstarction4();
    
	System.out.println(s.cardiologist()+ "\n" + s.neurologist()+ "\n" + s.dermatologist()+ "\n");
	}

}
0