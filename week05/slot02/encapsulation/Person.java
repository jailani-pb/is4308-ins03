package week05.slot02.encapsulation;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 18 && age <= 60) {
			this.age = age;
		} else {
			this.age = 18;
		}
	}

	public String getName() {
		return name;
	}
	
}
