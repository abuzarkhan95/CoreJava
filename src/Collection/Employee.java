package Collection;

public class Employee {
  private String name;
  private String address;
  private String company;
public Employee(String name, String address, String company) {
	this.name = name;
	this.address = address;
	this.company = company;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", company=" + company + "]";
}
	
}

