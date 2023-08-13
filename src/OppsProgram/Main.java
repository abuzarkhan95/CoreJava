package OppsProgram;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Circle {

	abstract double findAreaOfcircle(double radius);

}

abstract class Rectangle {
	abstract int findRectang(int length, int breadth);

}

class AreaOfCircle extends Circle {

	@Override
	double findAreaOfcircle(double radius) {
		double area = 22 * radius * radius / 7;

		return area;
	}

}

class AreaOfRectangle extends Rectangle {

	@Override
	int findRectang(int length, int breadth) {
		int areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}

	void ayaz() throws IOException {

	}

}

public class Main extends AreaOfRectangle {

	void ayaz() throws IOException {

	}

	public static void main(String[] args) {
		Circle a = new AreaOfCircle();
		Rectangle rectangle = new AreaOfRectangle();
		double b = a.findAreaOfcircle(8);
		int areaOfRect = rectangle.findRectang(50, 15);
		System.out.println("areaOfCircle : " + b + "\n areaOfReactangle :" + areaOfRect);

	}
}
