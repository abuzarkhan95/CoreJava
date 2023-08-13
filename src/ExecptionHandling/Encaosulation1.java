package ExecptionHandling;
 class A
 {
	 private int value;
	 public void SetValue(int v) {
		 value=v;
		 
	 }
	public int getValue() {
	
		return value;
		
	}
	 
	 
 }
 

public class Encaosulation1 {

	public static void main(String[] args) {
		A r=new A();
		r.SetValue(104);
		System.out.println(r.getValue());
		

	}

}
