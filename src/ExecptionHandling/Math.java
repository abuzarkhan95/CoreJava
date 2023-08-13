package ExecptionHandling;

class Bodmas {
	String addition(String a) {
		return a;
	}

}

public class Math extends Bodmas {
	String addition(String b) {
		return b;
	}

	public static void main(String[] args) {
		Bodmas d = new Math();
		d.addition("asad");

	}

}
