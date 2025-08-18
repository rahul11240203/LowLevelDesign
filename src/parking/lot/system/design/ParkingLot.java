package parking.lot.system.design;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ParkingLot {
	
	List<ParkingFloor> parkingFloorList;
	
	private ParkingLot() {}
	
	private static class Holder {
		private static final ParkingLot parkingLotInstance = new ParkingLot();
	}
	
	public static ParkingLot getInstance() {
		return Holder.parkingLotInstance;
	}
	
	
	public ParkingTicket parkVehicle(Vehicle vehicle) {
		return parkingFloorList.stream()
			 			.map(floor -> {
			 				ParkingSpot spot=floor.getAvailableSlotInFloor(vehicle);
			 				
			 				if(spot==null) {
			 					System.out.println("NO SPOT");
			 					return null;
			 				}
			 				System.out.println("SPOT ID >>" + spot.id + " SPOT FULL >>" + spot.isFree);
			 				if(spot.assignVehicle(vehicle)) {
			 					return new ParkingTicket(UUID.randomUUID().toString() , vehicle, LocalDateTime.now(), null, spot);
			 				}
			 				else {
			 					System.out.println("UNABLE TO PARK VEHICLE");
			 				}
							return null;
			 			})
			 			.filter(Objects::nonNull)
			 			.findFirst()
			 			.orElse(null);
	}
	
	public void leaveVehicle(ParkingTicket ticket) {
		String methodName=":leaveVehicle";
		try {
			ticket.parkingSpot.leaveParking();
			System.out.println("VEHICLE IS GONE");
		} catch(Exception e) {
			
		}
	}
}
