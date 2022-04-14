package MammalPackage;

public class Mammal {
	protected int energyLevel = 100;

	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public void displayEnergy() {
		System.out.printf("The energy level is: %d", this.energyLevel);
	}
	

}
