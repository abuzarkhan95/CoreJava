   final class AbuZar {
	private final int atm;
	private final int pin;          

	public AbuZar(int atm) {
		this.atm = atm;
		this.pin = 0;
	}

	public int getAtm() {
		int setPin;
		return atm;
	}
}

    public class ClassInmutable {
	public static void main(String[] args) {
		AbuZar abuzar = new AbuZar(9565);
		int atmNumber = abuzar.getAtm();
		System.out.println("ATM Number : " + atmNumber);
	}

}
