package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

	public static void main(String[] args) {
	Vector v = new Vector();
	v. add(23);
	v.add("Khan");
	v.add("Munna");
	v.add("Abusufiyan");
//	System.out.println(v);
	Enumeration e = v.elements();
	
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}
	}

}
