package parking.lot.system.design;

import java.util.Map;
import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;



public class ParkingSpotCache {
	private Map<VehicleType, Queue<ParkingSpot>> availableSpotMapping=null;
	
	public void addSpot(VehicleType vehicleType, ParkingSpot parkingSpot) {
		if(availableSpotMapping==null) {
			availableSpotMapping=new HashMap<>();
			if(availableSpotMapping.containsKey(vehicleType)) {
				Queue<ParkingSpot>spot=availableSpotMapping.get(vehicleType);
				spot.add(parkingSpot);
			}
			else {
				Queue<ParkingSpot>spot=new LinkedList<>();
				spot.add(parkingSpot);
				availableSpotMapping.put(vehicleType, spot);
			}
		}
	}
	
	
}
