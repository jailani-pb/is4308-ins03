package immigration;

public class SpecialOfficer extends Officer implements CargoChecker, PassengerChecker {

	public SpecialOfficer(String name) {
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

	@Override
	public boolean cargoInspection(LandVehicle vehicle) {
		// Make sure to use == or != to check for null
		if(vehicle != null && vehicle instanceof CargoVehicle) {
			return ((CargoVehicle) vehicle).cargoInspection();
		} else {
			return false;
		}
	}

}
