package immigration;

public class MotorCycle extends LandVehicle implements PassengerVehicle {
	
	private String passengerName;

	public MotorCycle(String licensePlate, String brand, String model, int maxPassenger, int maxCargo,
			String driverName, boolean permitted, String passengerName) {
		super(licensePlate, brand, model, maxPassenger, maxCargo, driverName, permitted);
		this.passengerName = passengerName;
	}

	@Override
	public boolean passengerInspection() {
		// Make sure to use == or != to check for null
		if(this.getDriverName() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

}
