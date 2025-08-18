package parking.lot.system.design;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
	String floorId;
	List<ParkingSpot> parkingSlotList;
	
	public ParkingFloor(String floorId, List<ParkingSpot> parkingSpotList) {
		this.floorId=floorId;
		this.parkingSlotList=parkingSpotList;
	}
	
	public ParkingSpot getAvailableSlotInFloor(Vehicle vehicle) {
		Optional<ParkingSpot>optionalParkingSpot = parkingSlotList.stream()
				.filter(obj -> obj.isFree==true && matchSpot(obj, vehicle)).findFirst();
		if(optionalParkingSpot.isPresent()) {
			return optionalParkingSpot.get();
		}
		return null;
	}
	
	public boolean matchSpot(ParkingSpot obj, Vehicle vehicle) {
		SpotType spotType = obj.spotType;
		VehicleType vehicleType = vehicle.vehicleType;
		if(VehicleType.MOTORCYCLE.equals(vehicleType) && SpotType.SMALL.equals(spotType)) {
			return true;
		}
		if(VehicleType.CAR.equals(vehicleType) && SpotType.MEDIUM.equals(spotType)) {
			return true;
		}
		if(VehicleType.TRUCK.equals(vehicleType) && SpotType.LARGE.equals(spotType)) {
			return true;
		}
		return false;
	}
}
