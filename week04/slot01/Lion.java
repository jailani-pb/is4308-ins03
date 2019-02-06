package week04.slot01;

public class Lion extends Animal {

	public Lion(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}

	@Override
	public void eat() {
		if(hunger == true) {
			System.out.println("ROAR! I am eating.");
		} else {
			System.out.println("ROAR! I am full.");
		}
	}
	
}
