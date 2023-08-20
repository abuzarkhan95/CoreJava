package OppsProgram;

class Person {
	private String name;
	private int age;

	public String getName() {
		// this.name = name;
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAge() {
		// this.age = age;
		return age;
	} 

	public void setAge(int age) {
		this.age = age;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Abuzar");
		person.setAge(20);
		System.out.println("Name" + person.getName());
		System.out.println("Age" + person.getAge());

	}

}
