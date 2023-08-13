package ExecptionHandling;
class write extends Language{
	void python() {
		System.out.println("Build website and software");
	}
}
class learn extends Language {
	void java() {
		
		System.out.println("java is a coding web application");
		
	}

 public void python() {
	 
		
	}
	
}

public class Language {
	
	public static void main(String[] args) {
		learn g = new learn();
		g.java();
		write f = new write() ;
		f.python();
	System.out.println("nonkhari chaii");	
	

	}

}
