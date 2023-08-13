package Collection;
import java.util.TreeSet;

public class CollectionNavigable{
		 
	    public static void main(String[] args)
	    {
	        TreeSet<String> ts = new TreeSet<String>();
	
	        ts.add("A");
	        ts.add("B");
	        ts.add("C");
	        ts.add("B");
	        ts.add("D");
	        ts.add("E");
	 
	        System.out.println("Initial TreeSet " + ts);
	        ts.remove("B");
	 
	        System.out.println("After removing element " + ts);
	        ts.pollFirst();
	 
	        System.out.println("After the removal of First Element " + ts);
	        ts.pollLast();
	 
	        System.out.println("After the removal of Last Element " + ts);
	      
	    }
	}
	


