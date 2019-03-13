package week06.slot02;

import java.util.*;

public class LearningSets {

	public static void main(String[] args) {
//		HashSet<String> icNumber = new HashSet<String>();
//		LinkedHashSet<String> icNumber = new LinkedHashSet<String>();
		TreeSet<String> icNumber = new TreeSet<String>();
		icNumber.add("00-123456");
		icNumber.add("00-000789");
		icNumber.add("01-987654");
		System.out.println(icNumber);
		
		icNumber.add("00-123456");
		System.out.println(icNumber);
		
		System.out.println(icNumber.contains("00-000789"));
		System.out.println(icNumber.contains("51-555333"));
		
		icNumber.remove("00-123456");
		System.out.println(icNumber);
		
		for(String ic : icNumber) {
			System.out.println(ic);
		}
	}
	
}
