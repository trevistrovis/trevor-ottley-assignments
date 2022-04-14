package MammalPackage;

public class Mammal {
	private int energyLevel = 100;

	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public String displayEnergy() {
		return(String.format("The energy level is: %d", this.energyLevel));
	}
	

}
