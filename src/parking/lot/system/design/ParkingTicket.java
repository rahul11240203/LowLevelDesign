package parking.lot.system.design;

import java.time.LocalDateTime;

public class ParkingTicket {
	String id;
	Vehicle vehicle;
	LocalDateTime entryTime;
	LocalDateTime exitTime;
	ParkingSpot parkingSpot;
	
	
	public ParkingTicket(String id, Vehicle vehicle, LocalDateTime entryTime, LocalDateTime exitTime, ParkingSpot spot) {
		this.id=id;
		this.vehicle=vehicle;
		this.entryTime=entryTime;
		this.exitTime=exitTime;
		this.parkingSpot=parkingSpot;
	}
}
