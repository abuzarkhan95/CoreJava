package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.zip.Inflater;

public class SetDemo {

	public static void main(String[] args) {

		Set l = new HashSet();
		l.add("Abusufiyan");
		l.add("Abuzar");
		l.add(30);
		l.add(20);
		l.add(20);
	    Iterator listr = l.iterator();
		while(listr.hasNext()) {
			
		}
		System.out.println(listr.next());
	}

	
	}


