package Collection;
import java.util.ArrayList;

public class ArrayListContainsExampl {

	public static void main(String[] args) {
		         
		        ArrayList<Integer> al = new ArrayList<Integer>();
		   
		        al.add(3); {
		    
		        al.add(17);
		        al.add(6);
		        al.add(9);
		        al.add(7);
		        if (al.contains(7)) {
		            System.out.println("7 was found in the list");
		        } else {
		            System.out.println("7 was not found in the list");
		        }
		    }
	}
}
