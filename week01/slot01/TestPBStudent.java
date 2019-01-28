package week01.slot01;

public class TestPBStudent {

	public static void main(String[] args) {
		PBStudent student1 = new PBStudent();
		PBStudent student2 = new PBStudent();
		PBGroup group1 = new PBGroup();
		group1.id = "ABC01";
		group1.name = "Group 1 for Abu Bakar Curi";
		group1.programme = "Diploma in ABC";
		
		student1.id = "A1";
		student1.name = "Jailani";
		student1.group = group1;
		
		student2.id = "A2";
		student2.name = "Rahman";
		student2.group = group1;
		
		student1.goToSchool();
		student2.goToSchool();
	}
	
}
