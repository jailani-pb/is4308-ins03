package week06.slot01;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Jailani");
		nameList.addFirst("Mohammad");
		nameList.addLast("Rahman");
		
		ListIterator<String> nameIterator = nameList.listIterator();
		System.out.println(nameIterator.next());
		System.out.println(nameIterator.next());
		System.out.println(nameIterator.next());
		if(nameIterator.hasNext()) {
			System.out.println(nameIterator.next());
		}
		while(nameIterator.hasPrevious()) {
			System.out.println(nameIterator.previous());
		}
		
		nameIterator.next();
		nameIterator.next();
		
		nameIterator.add("Abdul");
		System.out.println(nameIterator.previous());
		
		nameIterator.add("Haji");
		
		nameIterator.previous();
		nameIterator.remove();
		
		nameIterator.previous();
		nameIterator.previous();
		nameIterator.set("Md");
		
		System.out.println(nameList);
	}
	
}
