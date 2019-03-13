package week05.slot01;

public abstract class Animal {

	String fav_food;
	boolean hunger;
	
	public Animal(String fav_food, boolean hunger) {
		this.fav_food = fav_food;
		this.hunger = hunger;
	}
	
	public abstract void makeNoise();
	
	public void eat() {
		System.out.println("Antah! I am eating.");
	}

//	@Override
//	public String toString() {
//		return "Animal [fav_food=" + fav_food + ", hunger=" + hunger + "]";
//	}
	
	
	
}
