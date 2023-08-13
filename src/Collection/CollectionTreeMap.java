package Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class CollectionTreeMap {

	public static void main(String[] args) {
		TreeMap ma = new TreeMap<>();
		ma.put(106, "Abuzar");
		ma.put(103, "Sufiyan");
		ma.put(107, "Anzar");
		ma.put(104, "munna");
		ma.put(109, "Ansarul");
		
		System.out.println(ma.subMap(109, "Ansarul"));

	}

}
