package ExecptionHandling;

class Programmer {
void salary() {
	System.out.println("Programmer Salary is =300000");
}
}
class Employee extends Programmer{
	void bonus() {
		
		System.out.println("Bonus programmer is =10000");
			
	}

	public static void main(String[] args) {
		Employee p =  new Employee();
	p.salary();
	p.bonus();
	System.out.println();
	
	}
	}
 
