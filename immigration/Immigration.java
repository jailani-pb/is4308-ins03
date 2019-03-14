package immigration;

import java.util.ArrayList;
import java.util.Queue;

public class Immigration {

	private Queue<LandVehicle> lane1;
	private Queue<LandVehicle> lane2;
	private ArrayList<PassengerChecker> passengerOfficers;
	private ArrayList<CargoChecker> cargoOfficers;
	private int onDutyPassengerOfficer;
	private int onDutyCargoOfficer;
	
	public Immigration(Queue<LandVehicle> lane1, Queue<LandVehicle> lane2,
			ArrayList<PassengerChecker> passengerOfficers, ArrayList<CargoChecker> cargoOfficers,
			int onDutyPassengerOfficer, int onDutyCargoOfficer) {
		super();
		this.lane1 = lane1;
		this.lane2 = lane2;
		this.passengerOfficers = passengerOfficers;
		this.cargoOfficers = cargoOfficers;
		this.onDutyPassengerOfficer = onDutyPassengerOfficer;
		this.onDutyCargoOfficer = onDutyCargoOfficer;
	}

	public void inspectLane1() {
		if(!lane1.isEmpty()) {
			LandVehicle vehicle = lane1.poll();
			if(vehicle instanceof CargoVehicle && !cargoOfficers.isEmpty()) {
				if(onDutyCargoOfficer < 0 || onDutyCargoOfficer >= cargoOfficers.size()) {
					onDutyCargoOfficer = 0;
				}
				cargoOfficers.get(onDutyCargoOfficer).cargoInspection(vehicle);
				onDutyCargoOfficer++;
			}
			if(vehicle instanceof PassengerVehicle && !passengerOfficers.isEmpty()) {
				if(onDutyPassengerOfficer < 0 || onDutyPassengerOfficer >= passengerOfficers.size()) {
					onDutyPassengerOfficer = 0;
				}
				passengerOfficers.get(onDutyPassengerOfficer).passengerInspection(vehicle);
				onDutyPassengerOfficer++;
			}
		}
	}
	
	public void inspectLane2() {
		if(!lane2.isEmpty()) {
			LandVehicle vehicle = lane2.poll();
			if(vehicle != null && vehicle instanceof CargoVehicle) {
				if(onDutyCargoOfficer < 0 || onDutyCargoOfficer >= cargoOfficers.size()) {
					onDutyCargoOfficer = 0;
				}
				cargoOfficers.get(onDutyCargoOfficer).cargoInspection(vehicle);
				onDutyCargoOfficer++;
			}
			if(vehicle != null && vehicle instanceof PassengerVehicle) {
				if(onDutyPassengerOfficer < 0 || onDutyPassengerOfficer >= passengerOfficers.size()) {
					onDutyPassengerOfficer = 0;
				}
				passengerOfficers.get(onDutyPassengerOfficer).passengerInspection(vehicle);
				onDutyPassengerOfficer++;
			}
		}
	}

	public Queue<LandVehicle> getLane1() {
		return lane1;
	}

	public void setLane1(Queue<LandVehicle> lane1) {
		this.lane1 = lane1;
	}

	public Queue<LandVehicle> getLane2() {
		return lane2;
	}

	public void setLane2(Queue<LandVehicle> lane2) {
		this.lane2 = lane2;
	}

	public ArrayList<PassengerChecker> getPassengerOfficers() {
		return passengerOfficers;
	}

	public void setPassengerOfficers(ArrayList<PassengerChecker> passengerOfficers) {
		this.passengerOfficers = passengerOfficers;
	}

	public ArrayList<CargoChecker> getCargoOfficers() {
		return cargoOfficers;
	}

	public void setCargoOfficers(ArrayList<CargoChecker> cargoOfficers) {
		this.cargoOfficers = cargoOfficers;
	}

	public int getOnDutyPassengerOfficer() {
		return onDutyPassengerOfficer;
	}

	public void setOnDutyPassengerOfficer(int onDutyPassengerOfficer) {
		this.onDutyPassengerOfficer = onDutyPassengerOfficer;
	}

	public int getOnDutyCargoOfficer() {
		return onDutyCargoOfficer;
	}

	public void setOnDutyCargoOfficer(int onDutyCargoOfficer) {
		this.onDutyCargoOfficer = onDutyCargoOfficer;
	}
	
}
