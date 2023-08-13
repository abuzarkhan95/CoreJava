package ExecptionHandling;

public class Methodoverloding {
	void m1()
	{
		System.out.println("Abuzar");
	}
	
	void m1(String a)
	{
		System.out.println("Sufiyan");
	}
	
	

	public static void main(String[] args) {
		
		Methodoverloding t= new Methodoverloding();
		t.m1();
		t.m1("");
	}

}
