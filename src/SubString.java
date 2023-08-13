
public class SubString {

	public static void main(String[] args) {
		String str= "abuZarKhan";
		String str2= str.substring(3);
		String[] str3= str2.split("(?=[A-Z])");
		for(String str4: str3) {
		System.out.println(str4);
		}			
	}

}
