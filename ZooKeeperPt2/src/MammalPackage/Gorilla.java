package MammalPackage;

public class Gorilla extends Mammal{
	
	int getEnergyLevel = super.getEnergyLevel();
	
	public void throwSomething(){
		System.out.println("The gorilla has thrown a boulder!!");
		getEnergyLevel -= 5;
		super.getEnergyLevel();
	}
	
	public void eatBananas() {
		System.out.println("The gorilla is eating a banana! He looks energized...");
		getEnergyLevel += 10;
		super.getEnergyLevel();
		
	}
	
	public void climb() {
		System.out.println("Woah! The gorilla is climbing a tree!");
		getEnergyLevel -= 10;
		super.getEnergyLevel();
		
	}

}
