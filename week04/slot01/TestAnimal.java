package week04.slot01;

public class TestAnimal {

	public static void main(String[] args) {
		Lion lion1 = new Lion("Steak", false);
		lion1.makeNoise();
		lion1.eat();
//		lion1.play();
		Elephant elephant1 = new Elephant("Banana", true);
		elephant1.makeNoise();
		elephant1.eat();
//		elephant1.play();
		Giraffe giraffe1 = new Giraffe("Leaf", false);
		giraffe1.makeNoise();
		giraffe1.eat();
		giraffe1.play();
	}
	
}
