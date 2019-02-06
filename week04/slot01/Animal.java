package week04.slot01;

public class Animal {

	String fav_food;
	boolean hunger;
	
	public Animal(String fav_food, boolean hunger) {
		this.fav_food = fav_food;
		this.hunger = hunger;
	}
	
	public void makeNoise() {
		System.out.println("Antah!");
	}
	
	public void eat() {
		System.out.println("Antah! I am eating.");
	}

//	@Override
//	public String toString() {
//		return "Animal [fav_food=" + fav_food + ", hunger=" + hunger + "]";
//	}
	
	
	
}
