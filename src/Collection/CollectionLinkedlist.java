package Collection;

import java.util.LinkedList;

public class CollectionLinkedlist {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Abusufiyan");
		l.add("Abuzar");
		l.add(100);
		l.add(12.4);
		l.add('d');
		l.add("Abuzar");
		l.add("Abusufiyan");
		l.add(null);
		l.add(null);
		System.out.println(l);
		l.addLast("Munna");
		System.out.println(l);
	}

}
