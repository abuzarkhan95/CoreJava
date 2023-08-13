package Collection;

public class Worker {
private String workerName;
private int age;
private double salary;
public Worker(String workerName, int age, double salary) {
	this.workerName = workerName;
	this.age = age;
	this.salary = salary;
}
public String getWorkerName() {
	return workerName;
}
public void setWorkerName(String workerName) {
	this.workerName = workerName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "StackTest [workerName=" + workerName + ", age=" + age + ", salary=" + salary + "]";
}
 

}
