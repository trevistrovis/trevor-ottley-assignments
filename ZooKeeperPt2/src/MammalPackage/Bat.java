package MammalPackage;

public class Bat extends Mammal{
	
	private int energyLevel = 300;
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}

	public void fly() {
		System.out.println("The bat is flying fast!! Shhhewwww");
		energyLevel -= 50;
		
	}
	
	public void eatHumans() {
		System.out.println("OH MY GOD... uhh...");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The town is 100% on fire, all thanks to this giant bat.");
		energyLevel -= 100;
	}
	
	public String displayEnergy() {
		super.displayEnergy();
		return String.format("The bat's energy level is: %d", this.energyLevel);
		
	}

}
