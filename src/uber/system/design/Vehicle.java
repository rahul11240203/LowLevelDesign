package uber.system.design;

public class Vehicle {
	private String id;
	private String numberPlate;
	private VehicleType vehicleType;
	
	public Vehicle(String id, String numberPlate, VehicleType type) {
		this.vehicleType=type;
		this.numberPlate=numberPlate;
		this.vehicleType=type;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the numberPlate
	 */
	public String getNumberPlate() {
		return numberPlate;
	}

	/**
	 * @param numberPlate the numberPlate to set
	 */
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	/**
	 * @return the vehicleType
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}
