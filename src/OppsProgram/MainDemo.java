package OppsProgram;

public class MainDemo {
public static void main(String[] args) {
	Student student = new Student();
	Student1 student1 = new Student1();
	int age = student.getAge();
	student1.setAge(age);
	
	String name = student.getName();
	student1.setName(name);
	
	System.out.println(student1);
	
}
}
