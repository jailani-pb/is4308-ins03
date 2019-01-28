package week03.slot03;

import java.util.Arrays;

import week02.slot01.Cat;

public class Person {

	String name;
	Cat[] cats;

	public Person(String name) {
		this(name, 5);
	}
	
	public Person(int maxCat) {
		this("Anonymous", maxCat);
	}
	
	public Person(String name, int maxCat) {
		this.name = name;
		if(maxCat <= 0) {
			maxCat = 1;
		}
		cats = new Cat[maxCat];
	}
	
	public boolean adopt(String catName, int catHunger, int catMood) {
		return this.adopt(new Cat(catName, catHunger, catMood));
	}
	
	public boolean adopt(Cat cat) {
		for(int i = 0; i < cats.length; i++) {
			if(cats[i] != null) {
				if(cats[i].name.equals(cat.name)) {
					return false;
				}
			}
		}
		
		for(int i = 0; i < cats.length; i++) {
			if(cats[i] == null) {
				cats[i] = cat;
				return true;
			}
		}
		return false;
	}
	
	public boolean disown(String catName) {
		for(int i = 0; i < cats.length; i++) {
			if(cats[i] != null) {
				if(cats[i].name.equals(catName)) {
					cats[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cats=" + Arrays.toString(cats) + "]";
	}
	
}
