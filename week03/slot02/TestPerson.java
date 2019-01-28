package week03.slot02;

import week02.slot01.Cat;

public class TestPerson {

	public static void main(String[] args) {
		Person person1 = new Person("Jailani", 3);
		
		Cat cat1 = new Cat("ABC", 50, 50);
		person1.adopt(cat1);
		
		person1.adopt(new Cat("DEF", 50, 50));
		
		System.out.println(person1);
		
		person1.disown("ABC");
		
		System.out.println(person1);
	}
	
}
