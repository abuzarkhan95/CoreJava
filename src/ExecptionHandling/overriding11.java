package ExecptionHandling;
class Vehicle{
	Vehicle Getobject() {
		System.out.println("speed");
		return new Vehicle();
	}
}
class Car extends Vehicle{
	Car Getobject() {
		
		System.out.println("130");
		return new Car();
	}
}

public class overriding11 {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.Getobject();
		

	}

}
