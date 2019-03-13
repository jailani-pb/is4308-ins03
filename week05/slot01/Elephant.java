package week05.slot01;

public class Elephant extends Animal implements Playful, Angry {

	public Elephant(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}

	public void eat() {
		if(fav_food.equalsIgnoreCase("Banana")) {
			super.eat();
		} else {
			System.out.println("Fav Food is " + fav_food + ". Not Banana.");
		}
	}

	public void makeNoise() {
		System.out.println("PAWOO!");
	}

	@Override
	public void play() {
		System.out.println("PAWOO! I am playing.");
	}
}
