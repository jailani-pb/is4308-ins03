package immigration;

import java.util.HashMap;

public class Car extends LandVehicle implements PassengerVehicle, CargoVehicle {

	private HashMap<String, Boolean> passengers;
	private HashMap<String, Boolean> cargos;
	private boolean cargoPermitted;
	
	public Car(String licensePlate, String brand, String model, int maxPassenger, int maxCargo, String driverName,
			boolean permitted, HashMap<String, Boolean> passengers, HashMap<String, Boolean> cargos,
			boolean cargoPermitted) {
		super(licensePlate, brand, model, maxPassenger, maxCargo, driverName, permitted);
		this.passengers = passengers;
		this.cargos = cargos;
		this.cargoPermitted = cargoPermitted;
	}

	@Override
	public boolean cargoInspection() {
		// Make sure to use == or != to check for null
		if(this.getDriverName() == null || this.getMaxCargo() > cargos.size()) {
			return false;
		} else {
			if(!this.isPermitted() && !cargos.isEmpty()) {
				cargoPermitted = true;
				for(String cargo : cargos.keySet()) {
					passengers.replace(cargo, false, true);
				}
			}
			return true;
		}
	}

	@Override
	public boolean passengerInspection() {
		// Make sure to use == or != to check for null
		if(this.getDriverName() == null || this.getMaxPassenger() > passengers.size()) {
			return false;
		} else {
			if(!this.isPermitted() && !passengers.isEmpty()) {
				if(cargoPermitted) {
					this.setPermitted(true);
					for(String passenger : passengers.keySet()) {
						passengers.replace(passenger, false, true);
					}
				} else {
					return cargoInspection();
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

	public HashMap<String, Boolean> getCargos() {
		return cargos;
	}

	public void setCargos(HashMap<String, Boolean> cargos) {
		this.cargos = cargos;
	}

	public boolean isCargoPermitted() {
		return cargoPermitted;
	}

	public void setCargoPermitted(boolean cargoPermitted) {
		this.cargoPermitted = cargoPermitted;
	}
	
}
