
public class StringSplit {

	public static void main(String[] args) {
	String str = "AbuZarKhan";
	String[] str2= str.split("(?=[A-Z])");
	for(String str3: str2) {
	System.out.println(str3);	
	}
	
	}

}
