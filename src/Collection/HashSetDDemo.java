package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Anzar");	 
    	al.add("Ansarual");
    	System.out.println(al);
		HashSet<String> h = new HashSet<>(al);
		h.add("Abuzar");
		h.add("xyz");
		h.add("sufiyan");
		h.add("12.30");
		h.add("khan");
		h.add("Abuzar");
		h.removeAll(h);
		Iterator<String> itr = h.iterator();
		while(itr.hasNext()) {	
		
		System.out.println(h.size());
		}
	}
}
