package parking.lot.system.design;

abstract class Vehicle {
	String numberPlate;
	VehicleType vehicleType;
	
	public Vehicle(String numberPlate, VehicleType type) {
		this.numberPlate=numberPlate;
		this.vehicleType=type;
	}
}
