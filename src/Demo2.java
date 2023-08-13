import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		String str = "abcaba";
		
		Map<Character,Integer> map = new HashMap<>(); 
		
		
		for(char c : str.toCharArray()) {
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c,++count);
			}else {
				map.put(c,1);
			}
		}
		
		for(char c : map.keySet()) {
			if(map.get(c) > 1) {
				System.out.println("Charecter : "+ c + " count : " + map.get(c));
			}
		}
		
	}
}