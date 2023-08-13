
public class LogicArrayTow {

	public static void main(String[] args) {
		int c=10;
		int a[]= {10,5,3,7,5,9,1,7,2};
		for(int i=0; i<a.length; i++) {
		for(int j=i+1;j<a.length;j++){				
			if(a[i]+a[j]==c)
		System.out.println(i+"+"+j+"="+c);

		}
		
		}
	}
 	
}
