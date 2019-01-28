package week01.slot01;

public class PBStudent {

	String id;
	String name;
	PBGroup group;
	
	public void goToSchool() {
		System.out.println(group.id + " - " + group.name);
		System.out.println(group.programme);
		System.out.println(id + " " + name + " is going to school.");
	}
	
}
