package Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(107, "Abuzar");
		m.put(102, "Sufiyan");
		m.put(109, "Anzar");
		m.put(104, "Munna");
		System.err.println(m);
		m.replace(102, "Abrar");
		// m.clear();
		System.out.println(m);

	}

}
