package MammalPackage;

public class BatTest {
	
	public static void main(String[]args) {
		Bat b = new Bat();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		System.out.println(b.displayEnergy());
		
	}

}
