package Collection;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Employee> vectorEmployee= new Stack<>();
		vectorEmployee.add(new Employee(null, null, null));
		vectorEmployee.add(new Employee("Abuzar", "SakiNaka", "Google"));
		vectorEmployee.add(new Employee(null, null, null));
		vectorEmployee.add(new Employee("Abusufiyan", "SakiNaka","Microsoft"));
		Enumeration<Employee> enumeration= vectorEmployee.elements();
		while (enumeration.hasMoreElements()) {	
		
			System.out.println(enumeration.nextElement());
}
	}
	}


