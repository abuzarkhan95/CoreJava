package Collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionINVector {

	public static void main(String[] args) {
	Vector<String> exp = new Vector<>();
	exp.add("Abusufiyan");
	exp.add("Abuzar");
	exp.add("Anzar");
	exp.add("Abuzar");
	exp.add(null);
	 Enumeration<String> dex = exp.elements();
	 while(dex.hasMoreElements())
	 System.out.println(dex.nextElement());
	}

}
