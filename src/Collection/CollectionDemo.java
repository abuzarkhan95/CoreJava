package Collection;
import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
	    al.add(100);
		al.add(200);
    	al.add(300);
		System.out.println(al.add("abuzar,Abusufiyan"));
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add("Abuzar");
		al2.add("Abusufiyan");	al2.add("Anzar");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
	}

}
