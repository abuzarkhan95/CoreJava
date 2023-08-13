import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Conncurentmodification {

	public static void main(String[] args) {
		List list = new CopyOnWriteArrayList();
		list.add(1);
		list.add(2);
		Iterator itr = list.iterator();
		while (itr.hasNext())
			list.add(10);
	//	System.out.println(itr);

		System.out.println(itr.next());
	}

}
