package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator{

	

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Munna");
		l.add(15);
		l.add("Abusufiyan");
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr .hasNext())
		{
			System.out.println(itr. next());
			
		}
	

	}
}
