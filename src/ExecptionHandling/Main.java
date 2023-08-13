package ExecptionHandling;

abstract class Shape {
	   
	abstract String draw();
	
}

class Rectangle extends Shape {
	String draw() {
		return "drawing rectangle";

	}
}

class Circle extends Shape {
	String draw() {
		return "drawing circle";

	}
}

public class Main {

	public static void main(String[] args) {
         
		Shape r = new Rectangle();
		Circle c = new Circle();
		String rectang = r.draw();
		String circle = c.draw();
		   
		System.out.println(rectang + "\n" + circle);

	}
}
