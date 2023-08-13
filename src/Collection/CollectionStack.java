package Collection;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Abuzar");
		s.push("Abusufiyan");
		s.push(200);
		s.push(100.66);
		System.out.println(s.empty());
	
		System.out.println(s.peek());
		System.out.println(s);
	}

}
