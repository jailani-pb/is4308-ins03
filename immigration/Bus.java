package immigration;

import java.util.HashMap;

public class Bus extends LandVehicle implements PassengerVehicle {
	
	private HashMap<String, Boolean> passengers;

	public Bus(String licensePlate, int maxPassenger, int maxCargo, String driverName, boolean permitted,
			HashMap<String, Boolean> passengers) {
		super(licensePlate, maxPassenger, maxCargo, driverName, permitted);
		this.passengers = passengers;
	}
	
	@Override
	public boolean passengerInspection() {
		// Make sure to use == or != to check for null
		if(this.getDriverName() == null && this.getMaxPassenger() > passengers.size()) {
			return false;
		} else {
			if(!this.isPermitted() && !passengers.isEmpty()) {
				this.setPermitted(true);
				for(String passenger : passengers.keySet()) {
					passengers.replace(passenger, false, true);
				}
			}
			return true;
		}
	}

	public HashMap<String, Boolean> getPassengers() {
		return passengers;
	}

	public void setPassengers(HashMap<String, Boolean> passengers) {
		this.passengers = passengers;
	}
	
}
