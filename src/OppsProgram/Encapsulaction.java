package OppsProgram;
class Demo{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
class Demo2 extends Demo{
	private int id;
	private String school;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}

public class Encapsulaction {
public static void main(String[] args) {
	Demo2 d=new Demo2();
	d.setAge(19);
	d.setName("Shoyeb");
	d.setId(101);
	d.setSchool("MIHS");
	System.out.println(d.getAge()+"\n"+d.getName()+"\n"+d.getId()+"\n"+d.getSchool());
}
}
