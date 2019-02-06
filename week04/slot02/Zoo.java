package week04.slot02;

import java.util.Arrays;

import week04.slot01.Animal;
import week04.slot01.Giraffe;

public class Zoo {

	Animal[] animals;
	
	public Zoo() {
		animals = new Animal[10];
	}
	
	public boolean adopt(Animal animal) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				return true;
			}
		}
		return false;
	}
	
	public void letsPlay(int index) {
		if(animals[index] instanceof Giraffe) {
			((Giraffe) animals[index]).play();
		} else {
			System.out.println("Unable to play.");
		}
	}
	
	public void letsPlayAlternative(int index) {
		try {
			((Giraffe) animals[index]).play();
		} catch(Exception e) {
			System.out.println("Unable to play.");
		}
		
//		try {
//			((Giraffe) animals[index]).play();
//		} catch(NullPointerException e) {
//			System.out.println("This is null.");
//		} catch(ClassCastException e) {
//			System.out.println("Unable to play.");
//		}
	}

	@Override
	public String toString() {
		return "Zoo [animals=" + Arrays.toString(animals) + "]";
	}
	
}




