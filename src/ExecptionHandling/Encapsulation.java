package ExecptionHandling;

 class Encapsulation1 {
	private int empid;
	public void SetEmpid(int eid)
	{
		empid=eid;
	}
	public int getEmpid()
	
	{
	return empid;	
	
	}
	
	}
public class Encapsulation
{
	public static void main(String[] args) {
Encapsulation1 r=new Encapsulation1();
r. SetEmpid(101);		
		System.out.println(r.getEmpid());
	}
}
