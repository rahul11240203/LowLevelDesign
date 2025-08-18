package parking.lot.system.design;

public class ParkingSpot {
	String id;
	SpotType spotType;
	boolean isFree;
	Vehicle vehicle;
	
	public ParkingSpot(String id, SpotType type, boolean isFree, Vehicle vehicle) {
		this.id=id;
		this.spotType=type;
		this.isFree=isFree;
		this.vehicle=vehicle;
	}
	
	public boolean assignVehicle(Vehicle vehicle) {
		boolean isAssigned=false;
		try {
			if(this.isFree==false) return false;
			
			this.isFree=false;
			this.vehicle=vehicle;
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return isAssigned;
		
	}
	
	public boolean leaveParking() {
		this.isFree=true;
		this.vehicle=null;
		return isFree;
		
	}
}
