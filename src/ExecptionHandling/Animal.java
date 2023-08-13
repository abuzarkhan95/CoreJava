package ExecptionHandling;

 class Lion {
	void roar()
	{
		System.out.println("Lion is eat the meat");
	}
 }
class dog extends Lion
{
	void bark()
	{
		System.out.println("dog is barking");
		
	}
}

class goat extends dog{
	void meme() {
	System.out.println("goat eat grass");	
		
	}
}
class Animal{
	public static void main(String[] args) {
	goat h = new goat();
	h.roar();
	h.bark();
	h.meme();
	}	 
	}


