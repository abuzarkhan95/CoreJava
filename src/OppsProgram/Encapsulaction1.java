package OppsProgram;
class Emp{
	private int age;
	public void setAge(int age) throws Exception {
		if(age>=18) {
			System.out.println("Eligible For Vote");
		}
		else {
			throw new Exception("Your Are Not Eligible For Vote");
		}
		this.age=age;
	}
	public int getAge() throws Exception {
		
		return age;
	}
	
}
public class Encapsulaction1 {

	public static void main(String[] args) throws Exception {
		Emp e=new Emp();
		e.setAge(17);
		//e.getAge();
	}

}
0