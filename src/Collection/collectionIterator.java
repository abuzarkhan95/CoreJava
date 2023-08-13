package Collection;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class collectionIterator {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(20);
		l.add("Munna");
		l.add("Khan");

		ListIterator li = l.listIterator(l.size());
	while (li.hasNext()) {
		System.out.println(li.next());
	}
		//li.next();
	//	li.next();
	//	System.out.println(".........................");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.add("Abusufiyan");
		System.out.println(l);
	//	li.set(100);
	// 	System.out.println(l);
		
	}

}

