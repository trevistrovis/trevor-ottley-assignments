package MammalPackage;

public class Gorilla extends Mammal{
	
	public void throwSomething(){
		System.out.println("The gorilla has thrown a boulder!!");
		super.energyLevel -= 5;
		super.getEnergyLevel();
	}
	
	public void eatBananas() {
		System.out.println("The gorilla is eating a banana! He looks energized...");
		super.energyLevel += 10;
		super.getEnergyLevel();
		
	}
	
	public void climb() {
		System.out.println("Woah! The gorilla is climbing a tree!");
		super.energyLevel -= 10;
		super.getEnergyLevel();
		
	}

}
