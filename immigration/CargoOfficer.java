package immigration;

public class CargoOfficer extends Officer implements CargoChecker {

	public CargoOfficer(String name) {
		super(name);
	}

	public boolean cargoInspection(LandVehicle vehicle) {
		// Make sure to use == or != to check for null
		if(vehicle == null || !(vehicle instanceof CargoVehicle)) {
			return false;
		} else {
			return ((CargoVehicle) vehicle).cargoInspection();
		}
		/* Other way to solve this */
		//	if(vehicle != null && vehicle instanceof CargoVehicle) {
		//		return ((CargoVehicle) vehicle).cargoInspection();
		//	} else {
		//		return false;
		//	}
	}

}
