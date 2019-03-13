package week05.slot01;

import week02.slot01.Cat;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Lion("Steak", false);
		animal.makeNoise();
		animal.eat();
		animal = new Elephant("Banana", false);
		animal.makeNoise();
		animal.eat();
		animal = new Giraffe("Leaf", false);
		animal.makeNoise();
		animal.eat();
		
		letsPlay(new Giraffe("Grass", true));
		letsPlay(new Elephant("Bamboo", true));
		letsPlay(new Cat("ABC", 30, 30));
	}
	
	public static void letsPlay(Object object) {
		if(object instanceof Playful) {
			((Playful) object).play();
		} else {
			System.out.println("Unable to play.");
		}
	}
	
}





