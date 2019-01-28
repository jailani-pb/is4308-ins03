package week02.slot01;

public class Cat {

	int moodLevel;
	int hungerLevel;
	public String name;
	
	// Constructor
				// Parameter Variable
	public Cat(String catName, int catHunger, int catMood) {
		name = catName;
		hungerLevel = catHunger;
		// Limit hungerLevel 0-100
		if(hungerLevel < 0) {
			hungerLevel = 0;
		}
		if(hungerLevel > 100) {
			hungerLevel = 100;
		}
		moodLevel = catMood;
		// Limit moodLevel 0-100
		if(moodLevel < 0) {
			moodLevel = 0;
		}
		if(moodLevel > 100) {
			moodLevel = 100;
		}
	}
	
	public String play(int minutes) {
		if(minutes < 0) {
			return name + " cannot go back in time.";
		} else {
			hungerLevel = hungerLevel - minutes;
			moodLevel = moodLevel + minutes;
			if(hungerLevel < 0) {
				hungerLevel = 0;
			}
			if(moodLevel > 100) {
				moodLevel = 100;
			}
			return name + " is playing. Hunger decreases, Mood increases.";
		}
	}

	@Override
	public String toString() {
		return "Cat [moodLevel=" + moodLevel + ", hungerLevel=" + hungerLevel + ", name=" + name + "]";
	}
	
//	public String feed() {
//		
//	}
//	
//	public String jealous() {
//		
//	}
	
	
	
}
