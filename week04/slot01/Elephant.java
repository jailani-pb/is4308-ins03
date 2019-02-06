package week04.slot01;

public class Elephant extends Animal {

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
}
