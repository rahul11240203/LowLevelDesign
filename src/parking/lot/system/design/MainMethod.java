package parking.lot.system.design;

import java.util.Arrays;
import java.util.List;

public class MainMethod {
	public static void main(String[] args) {
		 ParkingSpot spot1=new ParkingSpot("SP1", SpotType.MEDIUM, true, null);
		 ParkingSpot spot2=new ParkingSpot("SP2", SpotType.MEDIUM, true, null);
		 ParkingSpot spot3=new ParkingSpot("SP3", SpotType.MEDIUM, true, null);
		 ParkingSpot spot4=new ParkingSpot("SP4", SpotType.MEDIUM, true, null);
		 
		 List<ParkingSpot> spotList=Arrays.asList(spot1, spot2, spot3, spot4);
		 
		 ParkingFloor floor1=new ParkingFloor("PF1", spotList);
		
		 List<ParkingFloor> floorList=Arrays.asList(floor1);
		 
		 
		 ParkingLot lot=ParkingLot.getInstance();
		 lot.parkingFloorList=floorList;
		 
		 Vehicle vehicle1=new Vehicle("UP91S4365", VehicleType.CAR) {};
		 Vehicle vehicle2=new Vehicle("UP91S4365", VehicleType.CAR) {};
		 Vehicle vehicle3=new Vehicle("UP91S4365", VehicleType.CAR) {};
		 Vehicle vehicle4=new Vehicle("UP91S4365", VehicleType.CAR) {};
		 Vehicle vehicle5=new Vehicle("UP91S4365", VehicleType.CAR) {};
		 
		 ParkingTicket ticket1=lot.parkVehicle(vehicle1);
		 ParkingTicket ticket2=lot.parkVehicle(vehicle2);
		 ParkingTicket ticket3=lot.parkVehicle(vehicle3);
		 ParkingTicket ticket4=lot.parkVehicle(vehicle4);
		 ParkingTicket ticket5=lot.parkVehicle(vehicle5);
		 
		 if(ticket1==null) 
			 System.out.println("THERE IS NO SPOT");
		 else
			 System.out.println("TICKET >>" + ticket1.id);
		 if(ticket2==null) 
			 System.out.println("THERE IS NO SPOT");
		 else
			 System.out.println("TICKET >>" + ticket2.id);
		 if(ticket3==null) 
			 System.out.println("THERE IS NO SPOT");
		 else
			 System.out.println("TICKET >>" + ticket3.id);
		 if(ticket4==null) 
			 System.out.println("THERE IS NO SPOT");
		 else
			 System.out.println("TICKET >>" + ticket4.id);
		 if(ticket5==null) 
			 System.out.println("THERE IS NO SPOT");
		 else
			 System.out.println("TICKET >>" + ticket5.id);
		 
	}
}
