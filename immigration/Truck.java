package immigration;

import java.util.HashMap;

public class Truck extends LandVehicle implements CargoVehicle {

	private HashMap<String, Boolean> cargos;

	public Truck(String licensePlate, String brand, String model, int maxPassenger, int maxCargo, String driverName,
			boolean permitted, HashMap<String, Boolean> cargos) {
		super(licensePlate, brand, model, maxPassenger, maxCargo, driverName, permitted);
		this.cargos = cargos;
	}

	@Override
	public boolean cargoInspection() {
		if(this.getDriverName() == null && cargos.size() > this.getMaxCargo()) {
			return false;
		} else {
			if(!this.isPermitted() && !cargos.isEmpty()) {
				this.setPermitted(true);
				for(String cargo : cargos.keySet()) {
					cargos.replace(cargo, false, true);
				}
			}
			return true;
		}
	}
	
	public HashMap<String, Boolean> getCargos() {
		return cargos;
	}

	public void setCargos(HashMap<String, Boolean> cargos) {
		this.cargos = cargos;
	}
	
}
