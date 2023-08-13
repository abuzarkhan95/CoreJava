package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionHasMap {

	public static void main(String[] args) {

		Map<Integer, String> ha = new HashMap<>();
		ha.put(102, "Sufiyan");
		ha.put(105, "Abuzar");
		ha.put(104, "Anzar");
		ha.put(107, "Ansarul");
		System.err.println(ha);
		for (Map.Entry S : ha.entrySet()) {
			System.err.println(S.getKey() + "-> " + S.  getValue());
		}

	}

	}
