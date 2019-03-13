package immigration;

public class PassengerOfficer extends Officer implements PassengerChecker {

	public PassengerOfficer(String name) {
		super(name);
	}

	@Override
	public boolean passengerInspection(LandVehicle vehicle) {
		// Make sure to use == or != to check for null
		if(vehicle != null && vehicle instanceof PassengerVehicle) {
			return ((PassengerVehicle) vehicle).passengerInspection();
		} else {
			return false;
		}
	}

}
