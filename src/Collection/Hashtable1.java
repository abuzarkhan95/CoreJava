package Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Demo{
	//public static void main(String[] args) {
        void main() {
		Hashtable<Integer, String> ha=new Hashtable<Integer, String>();
		ha.put(101, "Sufiyan");
		ha.put(102,"AbuZar");
		ha.put(103, "Ansarul");
		ha.put(104, "Shoyeb");
		for(Entry<Integer, String> map : ha.entrySet()) {
		System.out.println(map);
			
		}
	}
}
        public class Hashtable1 {

	    public static void main(String[] args) {
		Demo demo=new Demo();
		demo.main();

	}
	}
