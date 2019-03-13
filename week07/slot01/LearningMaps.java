package week07.slot01;

import java.util.HashMap;

public class LearningMaps {

	public static void main(String[] args) {
		HashMap<String, String> countryCapital = new HashMap<String, String>();
		countryCapital.put("Brunei", "Bandar Seri Begawan");
		countryCapital.put("Malaysia", "Kuala Lumpur");
		countryCapital.put("Indonesia", "Jakarta");
		countryCapital.put("Vietnam", "Hanoi");
		countryCapital.put("Thailand", "Bangkok");
		System.out.println(countryCapital);
		countryCapital.put("brunei", "Bandar Seri Begawan");
		System.out.println(countryCapital);
		
		System.out.println(countryCapital.get("Malaysia"));
		System.out.println(countryCapital.get("Cambodia"));
		
		System.out.println(countryCapital.containsKey("Malaysia"));
		System.out.println(countryCapital.containsKey("Cambodia"));
		
		System.out.println(countryCapital.containsValue("Bandar Seri Begawan"));
		System.out.println(countryCapital.containsValue("bandar seri begawan"));
		
		System.out.println(countryCapital.keySet());
		System.out.println(countryCapital.values());
		
		countryCapital.remove("brunei");
		countryCapital.remove("Indonesia", "Bandung");
		System.out.println(countryCapital);
		
		countryCapital.replace("Brunei", "BSB");
		countryCapital.replace("Malaysia", "Selangor", "Perak");
		System.out.println(countryCapital);
		
		countryCapital.put("Malaysia", "KL");
		countryCapital.put("Singapore", "Singapore");
		countryCapital.replace("Cambodia", "Phnom Penh");
		System.out.println(countryCapital);
	}
	
}


